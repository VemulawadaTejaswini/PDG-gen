import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int x = scan.nextInt();
			int[] y = new int[n];
			int[] yCheck = new int[n];
			int count = 0;

			if (n == 0 && a == 0 && b == 0 && c == 0 && x == 0)
				break;

			for (int i = 0; i < n; i++) {
				y[i] = scan.nextInt();
			}

			int place=0;
			
			while (true) {

					if (y[place] == x) {
						yCheck[place] = 1;
						place++;
					}
				

				if (count > 10000) {
					count = -1;
					break;
				}

				if (place>=n)
					break;

				x = (a * x + b) % c;
				
				count++;

			}

			System.out.println(count);
		}

		scan.close();
	}

}