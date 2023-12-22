import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] parts = br.readLine().split(" ");
		
		long N = Integer.parseInt(parts[0]);
		long  K = Integer.parseInt(parts[1]);
		
		parts = br.readLine().split(" ");
		
		long[] H = new long[parts.length];
		
		for (int i = 0; i < H.length; i++) {
			H[i] = Integer.parseInt(parts[i]);
		}
		
		Arrays.sort(H);

		
		long sum = 0;
		for (int i = 0; i < H.length-K; i++) {
			sum += H[i];
	
		}
		
		System.out.println(sum);
		
		
		
	}
}
