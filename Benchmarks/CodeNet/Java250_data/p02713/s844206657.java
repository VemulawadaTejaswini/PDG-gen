import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		long sum = 0;
		for(int i=1; i<K+1; i++) {
			for(int j=1; j<K+1; j++) {
				for(int k=1; k<K+1; k++) {
					sum += gcd(i, gcd(j, k));
				}
			}
		}
		
		System.out.println(sum);
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		
		return Math.abs(a);
	}

}