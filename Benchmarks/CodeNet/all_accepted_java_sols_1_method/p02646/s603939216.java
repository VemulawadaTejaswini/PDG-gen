import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long v = sc.nextInt();
		long b = sc.nextInt();
		long w = sc.nextInt();
		long t = sc.nextInt();

		if (a < b) {
			if (v > w) {
				if (v * t - w * t >= b - a) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		} else if (a > b) {
			if (v > w) {
				if (v * t - w * t >= a - b) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("YES");
		}

		sc.close();
	}

}