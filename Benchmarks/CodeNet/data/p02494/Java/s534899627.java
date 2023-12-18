import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x == 0 && y == 0) break;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}