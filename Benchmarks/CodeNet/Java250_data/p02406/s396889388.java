import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			} else {
				boolean include3 = false;
				
				do {
					if (x % 10 == 3)
						include3 = true;
					x /= 10;
				} while (x > 0);
				
				if (include3)
					System.out.print(" " + i);
			}
		}
		System.out.println();
	}

}

