import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int d = sc.nextInt();
				int loopCount = 600 / d - 1;
				long sum = 0L;

				for (int i = 1; i <= loopCount; i++) {
					int x = i * d;
					int p = x * x;
					sum += p * d;
				}
				System.out.println(sum);
			}
		} finally {
			sc.close();
		}
	}
}