import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int k = in.nextInt();
		int x = in.nextInt();
		solve(k, x);
	}

	private static void solve(int k, int x) {
		int l = x - k + 1;
		int r = x + k - 1;
		if (l < -1000000)
			l = -1000000;
		if (r > 1000000)
			r = 1000000;
		for (int i = l; i <= r; i++)
			System.out.print(i + " ");
		System.out.println();
	}
}
