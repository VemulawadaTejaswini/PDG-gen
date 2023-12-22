import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		try {
			String NMQ = reader.readLine();
			String[] NMQ_sp = NMQ.split(" ");
			int N = Integer.parseInt(NMQ_sp[0]);
			int M = Integer.parseInt(NMQ_sp[1]);
			int Q = Integer.parseInt(NMQ_sp[2]);
			int[] L = new int[M];
			int[] R = new int[M];
			int[] p = new int[Q];
			int[] q = new int[Q];
			int[][] train = new int[N + 1][N + 1];
			int[][] sum = new int[N + 1][N + 1];
			
			for(int i = 0; i < M; i++) {
				String LR = reader.readLine();
				String[] LR_sp = LR.split(" ");
				L[i] = Integer.parseInt(LR_sp[0]);
				R[i] = Integer.parseInt(LR_sp[1]);		
			}
			
			for(int i = 0; i < Q; i++) {
				String pq = reader.readLine();
				String[] pq_sp = pq.split(" ");
				p[i] = Integer.parseInt(pq_sp[0]);
				q[i] = Integer.parseInt(pq_sp[1]);	
			}
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					train[i][j] = 0;
				}
			}
			
			for(int i = 0; i < M; i++) {
				train[L[i]][R[i]] += 1;
			}
		
			for(int i = 0; i <= N; i++) {
				for(int j = 0; j <= N; j++) {
					sum[i][j] = 0;
				}
			}	
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					sum[i][j] = sum[i][j - 1] + train[i][j];
				}
			}
				
			for(int i = 0; i < Q; i++) {
				int count = 0;
				for(int j = p[i]; j <= q[i]; j++) {
					int a = sum[j][q[i]] - sum[j][p[i] - 1];
					count += a;
				}
				System.out.println(count);
			}
							
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
