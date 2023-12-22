import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			String[] array = line.split(" ");
			int n = Integer.parseInt(array[0]);
			int x = Integer.parseInt(array[1]);
			int count = 0;
			if (n == 0 && x == 0) {
				break;
			} else {
				for (int j = 1; j <= n; j++) {
					for (int k = j + 1; k <= n; k++) {
						for (int p = k + 1; p <= n; p++) {
							if (j + k + p == x)
								count++;
						}
					}
				}

			}
			System.out.println(count);
		}

	}

}