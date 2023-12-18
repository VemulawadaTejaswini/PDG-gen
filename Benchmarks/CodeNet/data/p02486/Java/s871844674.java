import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			int sum = 0;
			if (n == 0 && x == 0)
				break;
			for (int i = 1; i < n + 1; i++) {
				for (int j = i + 1; j < n + 1; j++) {
					for (int j2 = j + 1; j2 < n + 1; j2++) {
						if (i + j + j2 == x)
							sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}