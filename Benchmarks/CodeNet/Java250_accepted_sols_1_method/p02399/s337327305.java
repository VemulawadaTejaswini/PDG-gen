import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[2];
		str = in.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		if (a < 1 || b < 1 || Math.pow(10, 9) < a || Math.pow(10, 9) < b) {
			throw new RuntimeException("error: Range over");
		}
		int d = a / b;
		int r = a % b;
		double f = a / (double) b;
		System.out.printf("%d %d %.5f", d, r, f);
	}
}