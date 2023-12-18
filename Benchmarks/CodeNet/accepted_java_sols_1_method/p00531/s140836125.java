import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int p = scanner.nextInt();
		int x = a * p;
		int y = p > c ? b + (p - c) * d : b;
		System.out.println(x < y ? x : y);
		scanner.close();
	}

}

