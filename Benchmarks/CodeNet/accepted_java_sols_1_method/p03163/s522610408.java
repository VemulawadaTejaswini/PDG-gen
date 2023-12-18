import java.io.*;
import java.util.*;  
public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()); int W=Integer.parseInt(st.nextToken());
		int[] val= new int[N]; int[] weight= new int[N]; long[][]memo= new long[N+1][W+1];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i]=Integer.parseInt(st.nextToken());val[i]=Integer.parseInt(st.nextToken());
		}
		for (int i = N-1; i >= 0; i--) {
			for (int j = 0; j <= W; j++) {
				memo[i][j]=Math.max(j-weight[i]<0?Integer.MIN_VALUE:val[i]+memo[i+1][j-weight[i]], memo[i+1][j]);
			}
		}
		pw.print(memo[0][W]);
		pw.close();
	}
}