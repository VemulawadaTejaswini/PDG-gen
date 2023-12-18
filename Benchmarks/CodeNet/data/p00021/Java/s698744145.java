import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int dataset = sc.nextInt();
				double[] numbers = new double[8];
				for (int i = 0; i < dataset; i++) {
					numbers[i] = sc.nextDouble();

					if ((numbers[0] == numbers[2])
							&& (numbers[4] == numbers[6])) {
						System.out.println("YES");
					} else if ((numbers[1] == numbers[3])
							&& (numbers[5] == numbers[7])) {
						System.out.println("YES");
					} else if ((numbers[3] - numbers[1])
							/ (numbers[2] - numbers[0]) == (numbers[7]
							- numbers[5] / numbers[6] - numbers[4])) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		} finally {
			sc.close();
		}
	}
}