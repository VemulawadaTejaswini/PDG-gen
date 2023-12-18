import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);

		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[][] costs = new int[N][N + 1];
			
			for(int i = 0; i < N; i++){
				for(int j = 0; j <= N; j++){
					costs[i][j] = sc.nextInt();
				}
			}
			
			int[] bit = new int[1 << N];
			
			bit[0] = 0;
			for(int i = 1; i < bit.length; i++){
				bit[i] = Integer.MAX_VALUE;
			}
			
			
			for(int itr = 0; itr < N; itr++){
				//System.out.println(Arrays.toString(bit));
				
				for(int pos = bit.length - 1; pos >= 0; pos--){
					if(bit[pos] < Integer.MAX_VALUE){
						for(int flag = 0; flag <= N; flag++){
							if(flag == 0){
								
							}else if((pos & (1 << (flag - 1))) == 0){
								continue;
							}
							
							for(int stage = 0; stage < N; stage++){
								bit[pos | (1 << stage)] = Math.min(bit[pos | (1 << stage)], bit[pos] + costs[stage][flag]);
							}
							
						}
					}
				}
			}
			//System.out.println(Arrays.toString(bit));
			
			System.out.println(bit[(1 << N) - 1]);
			
		}
		
		
	}

}