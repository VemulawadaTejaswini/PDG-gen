import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			final int W = sc.nextInt();
			final int Q = sc.nextInt();
			
			if(W == 0 && Q == 0){
				break;
			}
			
			int[] is_used = new int[W];
			
			for(int i = 0; i < W; i++){
				is_used[i] = -1;
			}
			
			for(int i = 0; i < Q; i++){
				final String type = sc.next();
				
				if("s".equals(type)){
					final int id = sc.nextInt();
					final int w = sc.nextInt();
					
					int count = 0;
					int pos = -1;
					for(int j = 0; j < W; j++){
						if(is_used[j] == -1){
							count++;
							if(count >= w){
								pos = j;
								break;
							}
						}else{
							count = 0;
						}
					}
					
					if(pos == -1){
						System.out.println("impossible");
					}else{
						for(int j = pos - w + 1; j <= pos; j++){
							is_used[j] = id;
						}
						System.out.println(pos - w + 1);
					}
					
					
				}else if("w".equals(type)){
					final int id = sc.nextInt();
					
					for(int j = 0; j < W; j++){
						if(is_used[j] == id){
							is_used[j] = -1;
						}
					}
				}
			}
			
			System.out.println("END");
			
		}
	}

}