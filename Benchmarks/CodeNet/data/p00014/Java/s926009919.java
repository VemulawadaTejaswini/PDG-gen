import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int d = sc.nextInt();
				int areaCulcCount = 600 / d;
				long sum = 0L;

				for (int i = 1; i < areaCulcCount; i++) {
					int x = i * d;
					int y = x * x;
					sum += y * d;
				}
				sum += (areaCulcCount - d) * (areaCulcCount - d) * d;
				System.out.println(sum);
			}
		} finally {
			sc.close();
		}
	}
}