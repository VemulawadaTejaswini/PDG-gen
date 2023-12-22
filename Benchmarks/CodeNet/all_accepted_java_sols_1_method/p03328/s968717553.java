import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int a = sc.nextInt();
		final int b = sc.nextInt();

		final int east = b - a;

		int eastHight = 0;
		for (int i = 1; i <= east; i++) {
			eastHight = eastHight + i;
		}

		System.out.println(eastHight - b);

	}

}