import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 2];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int total = 0;
		for (int i = 1; i < a.length; i++) {
			total += Math.abs(a[i] - a[i - 1]);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 1; i <= n; i++) {
			int v1 = Math.abs(a[i] - a[i - 1]) + Math.abs(a[i] - a[i + 1]);
			int v2 = Math.abs(a[i + 1] - a[i - 1]);
			pw.println(total - v1 + v2);
		}
		pw.flush();
	}
}
