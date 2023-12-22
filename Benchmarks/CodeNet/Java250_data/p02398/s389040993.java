import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), count = 0;
		for (int i = a; i <= b; i++)
			if (c % i == 0)
				count++;

		System.out.println(count);
	}
}