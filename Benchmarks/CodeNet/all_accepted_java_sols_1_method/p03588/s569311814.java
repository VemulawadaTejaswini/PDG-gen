import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int max = 0, maxPoint = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			if (a > max) {
				max = a;
				maxPoint = b;
			}
		}
		System.out.println(max + maxPoint);
	}
}