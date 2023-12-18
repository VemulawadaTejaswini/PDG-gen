import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //yen
		int m = in.nextInt();
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			c[i] = in.nextInt();
		}

		int[] t = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			t[i] = 50000;
		}
		t[0] = 0;

		for (int i = 0; i < m; i++) {

			for (int j = c[i]; j <= n; j++) {

				t[j] = Math.min(t[j], t[j - c[i]] + 1);

			}
		}

		System.out.println(t[n]);
		in.close();
	}
}



