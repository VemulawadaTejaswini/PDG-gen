import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int[] array = new int[x];

		if (x == 1) {
			array[0] = scan.nextInt();
			System.out.println(array[0]);
		}

		else {
			for (int i = 0; i < x; i++) {
				array[i] = scan.nextInt();
			}

			System.out.print(array[x - 1] + " ");
			for (int i = x - 2; i > 0; i--) {
				System.out.print(array[i] + " ");
			}
			System.out.println(array[0]);
		}
	}
}