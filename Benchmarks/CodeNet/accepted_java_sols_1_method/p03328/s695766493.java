import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = b - a;

		int bh = (1 + h) * h / 2;

		int ans = bh - b;

		System.out.println(ans);

	}

}
