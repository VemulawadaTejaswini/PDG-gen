import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			}
			while (x >= 3) {
				x /= 10;
				if (x % 10 == 3) {
					if(i % 3 == 0){
						continue;
					}
					System.out.print(" " + i);
				}
			}

		}
		System.out.println("");
	}
}