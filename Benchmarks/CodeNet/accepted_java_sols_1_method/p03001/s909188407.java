import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.print((double) w * h / 2 + " ");
		if (x * 2 == w && y * 2 == h) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
