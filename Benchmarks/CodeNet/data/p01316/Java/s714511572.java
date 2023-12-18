import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int[][] DP = new int[20001][256];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			if(N == 0 && M == 0){
				break;
			}
			
			short[] data = new short[N];
			short[] code = new short[M];
			
			for(int i = 0; i < M; i++){
				code[i] = sc.nextShort();
			}
			
			for(int i = 0; i < N; i++){
				data[i] = sc.nextShort();
			}
			
			for(int i = 0; i <= N; i++){
				Arrays.fill(DP[i], Integer.MAX_VALUE);
			}
			
			DP[0][128] = 0;
			for(int i = 0; i < N; i++){
				for(int j = 0; j < 256; j++){
					if(DP[i][j] != Integer.MAX_VALUE){
						for(int c = 0; c < M; c++){
							final int next = Math.max(0, Math.min(j + code[c], 255));
							final int diff = (data[i] - next) * (data[i] - next);
							DP[i+1][next] = Math.min(DP[i+1][next], DP[i][j] + diff);
						}
					}
				}
			}
			
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < 256; i++){
				min = Math.min(min, DP[N][i]);
			}
			
			System.out.println(min);
		}
		
	}

}