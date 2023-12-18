import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int n = sc.nextInt();
				int sum = (n * n + n + 2) / 2;
				System.out.println(sum);
			}

		} finally {
			sc.close();
		}
	}
}