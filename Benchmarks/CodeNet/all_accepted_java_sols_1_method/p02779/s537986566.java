import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		String ans = "YES";

		Arrays.sort(a);

		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) ans = "NO";
		}

		System.out.println(ans);

		scan.close();
	}
}
