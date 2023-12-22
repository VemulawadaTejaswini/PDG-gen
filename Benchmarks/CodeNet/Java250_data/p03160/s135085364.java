import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] H = new int[N+1];
		
		String[] S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			H[i+1] = Integer.parseInt(S[i]);
		}
		System.out.println(minCostJump(N, H));
	}
	
	public static int minCostJump(int N, int[] H) {
		int[] cache = new int[N+1];
		
		cache[2] = Math.abs(H[1] - H[2]);
		for(int i = 3; i <= N; i++) {
			cache[i] = Math.min(cache[i-1] + Math.abs(H[i-1] - H[i]), cache[i-2] + Math.abs(H[i-2]-H[i]));
		}
		
		return cache[N];
	}
}
