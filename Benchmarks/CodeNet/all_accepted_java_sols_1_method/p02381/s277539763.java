import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;
		double a, m, b;

		Scanner stdIn = new Scanner(System.in);

		while (true) {
			b = 0.0;
			n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int[] s = new int[n];

			for (int i = 0; i < n; i++) {
				s[i] = stdIn.nextInt();
			}

			double temp = 0.0;
			for (Integer j : s) {
				temp += j;
			}
			m = (temp / n);

			int i = 0;
			for (Integer j : s) {
				b += Math.pow((j - m), 2);
				i++;
			}
			a = b / n;
			System.out.format("%.8f\n", Math.sqrt(a));
		}
		stdIn.close();
	}
}