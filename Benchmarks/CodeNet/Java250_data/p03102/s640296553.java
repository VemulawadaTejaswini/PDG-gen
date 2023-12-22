import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();

		int[] B = new int[M];
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}

		int ans = 0;

		for (int j = 0; j < N; j++) {
			int[] A = new int[M];

			int x = C;
			for (int i = 0; i < A.length; i++) {
				int a = sc.nextInt();
				x += (a * B[i]);
			}

			if (x > 0) {
				ans++;
			}

		}

		out.println(ans);
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
