import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++)
			d[i] = in.nextInt();
		System.out.println(solve(d));
		in.close();
	}

	private static int solve(int[] d) {
		Arrays.sort(d);
		int m = d.length / 2;
		return d[m] - d[m - 1];
	}
}
