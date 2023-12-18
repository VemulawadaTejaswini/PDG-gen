import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

 class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		String[] str = in.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		if (a < 1 || b < 1 || Math.pow(10, 9) < a || Math.pow(10, 9) < b) {
			throw new RuntimeException("error: Range over");
		}
		int d = a / b;
		int r = a % b;
		double f = a / (double) b;
		out.printf("%d %d %.5f", d, r, f);
	}
}