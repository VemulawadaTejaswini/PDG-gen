import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		System.out.println(solve(n));
		in.close();
	}

	private static String solve(int n) {
		int s = 0;
		int w = n;
		while (w > 0) {
			s += (w % 10);
			w /= 10;
		}
		if (n % s == 0)
			return "Yes";
		else
			return "No";
	}
}