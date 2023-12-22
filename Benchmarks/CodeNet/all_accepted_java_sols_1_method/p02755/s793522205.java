import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		sc.close();

		for (int b = 1; b < 9999999; b++) {
			if (Math.floor(b * 0.08) == A && Math.floor(b * 0.1) == B) {
				System.out.println(b);
				return;
			}
		}
		System.out.println(-1);
	}
}
