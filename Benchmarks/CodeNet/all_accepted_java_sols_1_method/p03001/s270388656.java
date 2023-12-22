import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long w = Long.parseLong(str[0]);
		long h = Long.parseLong(str[1]);
		long x = Long.parseLong(str[2]);
		long y = Long.parseLong(str[3]);

		double ans = (double) (w * h) / 2;
		System.out.print(ans + " ");

		if (2 * x == w && 2 * y == h) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
		System.out.println();
	}
}
