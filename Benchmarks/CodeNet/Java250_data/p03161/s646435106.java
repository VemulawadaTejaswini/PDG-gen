import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int K = Integer.parseInt(S[1]);
		int[] H = new int[N+1];
		
		S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			H[i+1] = Integer.parseInt(S[i]);
		}
		System.out.println(minCostJump(N, K, H));
	}
	
	public static int minCostJump(int N, int K, int[] H) {
		int[] cache = new int[N+1];
		
		for(int i = 2; i <= N; i++) {
			cache[i] = cache[i-1] + Math.abs(H[i-1] - H[i]);
			for(int j = i-2; j >= i-K && j > 0; j--) {
				cache[i] = Math.min(cache[i], cache[j] + Math.abs(H[j]-H[i]));
			}
		}
		
		return cache[N];
	}
}
