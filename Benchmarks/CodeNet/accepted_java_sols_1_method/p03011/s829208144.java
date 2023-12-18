import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int abc = p + q;
		int acb = r + q;
		int bac = p + r;

		int a = Math.min(abc, acb);
		int b = Math.min(a, bac);

		System.out.println(b);

		sc.close();

	}
}