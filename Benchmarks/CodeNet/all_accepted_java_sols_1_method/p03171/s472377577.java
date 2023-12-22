import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		String[] S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			A[i] = Integer.parseInt(S[i]);
		}
		
		long[][] taro = new long[N][N];
		long[][] jiro = new long[N][N];
		
		for(int i = 0; i < N; i++) {
			taro[i][i] = A[i];
			jiro[i][i] = -A[i];
		}
		
		
		for(int i = 0; i < N; i++) {
			int diagnol = i+1;
			int start = 0;
			int end = start + diagnol;
			while(end < N) {
				
				taro[start][end] = Math.max(A[start] + jiro[start+1][end],
										   A[end] + jiro[start][end-1]);
				
				jiro[start][end] = Math.min(-A[start] + taro[start+1][end],
						   -A[end] + taro[start][end-1]);
				start++;
				end = start + diagnol;
			}
		}
		
		System.out.println(taro[0][N-1]);
	}
}
