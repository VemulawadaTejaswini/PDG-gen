import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int num = sc.nextInt();
				int count = 0;
				boolean isPrime = true;
				if (num <= 1) {
					System.out.println(count);
				} else if (num == 2) {
					count++;
					System.out.println(count);
				} else if (num == 3) {
					count = 2;
					System.out.println(count);
				} else {
					for (int i = 3; i <= num; i += 2) {
						for (int j = 3; j < Math.sqrt(i); j += 2) {
							if (i % j == 0) {
								isPrime = false;
								break;
							}
						}
						if (isPrime) {
							count++;
						} else {
							isPrime = true;
						}
					}
					System.out.println(count);
					count = 0;
				}
			}
		} finally {
			sc.close();
		}

	}
}