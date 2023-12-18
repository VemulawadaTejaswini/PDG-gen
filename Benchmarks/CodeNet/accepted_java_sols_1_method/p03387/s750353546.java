import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int max = Math.max(Math.max(a, b), c);
		int k = max * 3 - a - b - c;
		if (k % 2 == 0) {
			System.out.println(k / 2);
		} else {
			k += 3;
			System.out.println(k / 2);
		}
	}
}
