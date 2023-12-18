import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				long d = sc.nextLong();
				long sum = 0;
				for (int i = 1; i * d < 600; i++) {
					sum += (i * d) * (i * d) * d;
				}
				System.out.println(sum);
			}
		} finally {
			sc.close();
		}
	}
}