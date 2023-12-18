import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int count = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						for (int l = 0; l < 10; l++) {
							if (i + j + k + l == n) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}