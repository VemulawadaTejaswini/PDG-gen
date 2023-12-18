import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n, x;
		int count = 0;
		Scanner stdIn = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			n = stdIn.nextInt();
			x = stdIn.nextInt();

			if(n == 0 && x == 0) {
				break;
			}

			for (int i = 1; i <= n; i++) {
				int j = (i + 1);
				int k = (x - i - j);

				if ((k != i && k != j) && k > i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}