import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		int[] b = new int[max + 1];
		for (int i = 0; i < n; i++) {
			b[a[i]]++;
		}

		int id = 0;
		int[] c = new int[n];
		for (int i = 0; i <= max; i++) {
			for (int j = 0; j < b[i]; j++) {
				c[id++] = i;
			}
		}

		String tab = "";
		for (int i = 0; i < n; i++) {
			System.out.print(tab + c[i]);
			tab = " ";
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}