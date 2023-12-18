import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static final int SIZE = 5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			if(count != 0){
				System.out.println();
			}
			
			boolean[][][] box = new boolean[SIZE + 2][SIZE + 2][SIZE + 2];
			boolean[][][] tmp_box = new boolean[SIZE + 2][SIZE + 2][SIZE + 2];
			
			for(int z = 0; z < SIZE; z++){
				for(int y = 0; y < SIZE; y++){
					char[] input = sc.next().toCharArray();
					
					for(int x = 0; x < SIZE; x++){
						box[z + 1][y + 1][x + 1] = input[x] == '1';
					}
				}
			}
			
			final int M1 = sc.nextInt();
			Set<Integer> a_set = new HashSet<Integer>(M1);
			for(int i = 0; i < M1; i++){
				a_set.add(sc.nextInt());
			}
			
			final int M2 = sc.nextInt();
			Set<Integer> b_set = new HashSet<Integer>(M2);
			for(int i = 0; i < M2; i++){
				b_set.add(sc.nextInt());
			}
			
			
			for(int day = 0; day < N; day++){
				for(int z = 0; z < SIZE; z++){
					for(int y = 0; y < SIZE; y++){
						for(int x = 0; x < SIZE; x++){
							int around = 0;
							
							for(int z_t = -1; z_t <= 1; z_t++){
								for(int y_t = -1; y_t <= 1; y_t++){
									for(int x_t = -1; x_t <= 1; x_t++){
										if(z_t == 0 && y_t == 0 && x_t == 0){
											continue;
										}
										
										if(box[z + 1 + z_t][y + 1 + y_t][x + 1 + x_t]){
											around++;
										}
									}
								}
							}
							
							if(box[z + 1][y + 1][x + 1]){
								if(!b_set.contains(around)){
									tmp_box[z + 1][y + 1][x + 1] = false;
								}else{
									tmp_box[z + 1][y + 1][x + 1] = box[z + 1][y + 1][x + 1];
								}
							}else{
								if(a_set.contains(around)){
									tmp_box[z + 1][y + 1][x + 1] = true;
								}else{
									tmp_box[z + 1][y + 1][x + 1] = box[z + 1][y + 1][x + 1];
								}
							}
						}
					}
				}
				
				boolean[][][] swap = box;
				box = tmp_box;
				tmp_box = swap;
			}
			
			System.out.println("Case " + (count + 1) + ":");
			for(int z = 0; z < SIZE; z++){
				for(int y = 0; y < SIZE; y++){
					for(int x = 0; x < SIZE; x++){
						System.out.print(box[z+1][y+1][x+1] ? "1" : "0");
					}
					System.out.println();
				}
				
				if(z != SIZE - 1){
					System.out.println();
				}
			}
			
			count++;
		}
	}

}