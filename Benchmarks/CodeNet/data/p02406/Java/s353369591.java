import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();
		for (int i = 1; i <= loop; i++)
			if (i % 3 == 0 || i % 10 == 3)
				System.out.print(" " + i);

		System.out.println();
	}
}