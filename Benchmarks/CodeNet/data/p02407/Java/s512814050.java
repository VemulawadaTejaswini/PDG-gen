import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] list = new int[length];

		for (int i = 0; i < length; i++)
			list[i] = scanner.nextInt();

		for (int i = length - 1; i >= 0; i--)
			System.out.print(list[i % length] + (i > 0 ? " " : ""));

		System.out.println();
	}
}