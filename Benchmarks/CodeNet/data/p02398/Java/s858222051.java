import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int count = 0;
		for (; a<=b; a++) {
			if (isDivisor(a, c)) {
				count++;
			}
		}
		System.out.println(count);
	}

	static boolean isDivisor(int a, int c) {
		if (c % a == 0) {
			return true;
		}

		return false;
	}
}