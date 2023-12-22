import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		long[] a = new long[n];
		for (int i = 1; i <= n; i++)
			a[i - 1] = (in.nextLong() * 1000000) + i;
		Arrays.sort(a);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] % 1000000 + " ");
		System.out.println();
		in.close();
	}
}