import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		long[] difficults = new long[N];
		long[] partial_sum = new long[N];
		for(int i = 0; i < N; i++){
			final long a = sc.nextLong();
			
			difficults[i] = a;
		}
		Arrays.sort(difficults);
		for(int i = 0; i < N; i++){
			partial_sum[i] = difficults[i] + (i == 0 ? 0 : partial_sum[i - 1]);
		}
		
		
		final int M = sc.nextInt();
		int[] solver = new int[M];
		for(int i = 0; i < M; i++){
			final int b = sc.nextInt();
			solver[i] = b;
		}
		
		for(int i = 0; i < M; i++){
			final long purpose = sc.nextLong();
			final int rate = solver[i];
			
			if(difficults[0] > rate){
				System.out.println(purpose <= 0 ? "Yes" : "No");
			}else{
				int lower = 0;
				int higher = N;
				
				// [lower, higher)
				while(lower + 1 != higher){
					final int mid = (lower + higher) / 2;
					//System.out.println(lower + ", " + higher + ", " + mid + " => " + difficults[mid] + " " + solver[i]);
					
					if(difficults[mid] <= solver[i]){
						lower = mid;
					}else{
						higher = mid;
					}
				}
				//System.out.println(lower);
				
				final long score = partial_sum[lower];
			
				System.out.println(score >= purpose ? "Yes" : "No");
			}
		}
		
	}
	
} 