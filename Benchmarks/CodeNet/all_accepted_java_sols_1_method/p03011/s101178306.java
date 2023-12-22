import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int a = p + q;
		int b = q + r;
		int c = r + p;

		System.out.println(Math.min(a, Math.min(b, c)));
	}
}