import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int W = Integer.parseInt(S[1]);
		int[] weight = new int[N+1];
		int[] value = new int[N+1];
		
		
		for(int i = 1; i <= N ; i++) {
			S = br.readLine().split(" ");
			weight[i] = Integer.parseInt(S[0]);
			value[i] = Integer.parseInt(S[1]);
		}
		
		long[][] cache = new long[N+1][W+1];
		
		
		for(int i = 1; i <= N ; i++) {
			for(int w = 1; w <= W ; w++) {
				cache[i][w] = cache[i-1][w];
				if(w >= weight[i]) {
					 cache[i][w] = Math.max(cache[i][w], value[i]+ cache[i-1][w-weight[i]]);
				}
			}
		}
		
		System.out.println(cache[N][W]);
	}
}
