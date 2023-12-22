import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n + 1];
			for (int i = 1; i < n; i++) {
				a[sc.nextInt()]++;
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				sb.append(a[i]).append(System.lineSeparator());
			}

			System.out.print(sb);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
