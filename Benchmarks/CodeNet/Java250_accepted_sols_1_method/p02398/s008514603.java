import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] a_b_c = str.split(" ", 0);

		int a = Integer.parseInt(a_b_c[0]);
		int b = Integer.parseInt(a_b_c[1]);
		int c = Integer.parseInt(a_b_c[2]);

		int divisor = 0;

		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				divisor++;
			}
		}
		System.out.println(divisor);
	}
}