import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Fibonacci Number
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}

	static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return 2 * n - 3;
		}
	}
}