import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int Q = stdIn.nextInt();
		int[] c = new int[N];
		for(int i = 0; i < N; i++) {
			c[i] = stdIn.nextInt();
		}
		Arrays.sort(c);
		for(int i = 0; i < Q; i++) {
			int max = 0;
			int q = stdIn.nextInt();
			for(int j = c.length-1; j >= 0; j--) {
				if(c[j] % q > max) max = c[j] % q;
			}
			System.out.println(max);
		}

		

	}
}