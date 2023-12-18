import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tr = new int[3];

		for (int i = 0; i < 3; i++) {
			tr[i] = sc.nextInt();
		}

		int a = tr[0];
		int b = tr[1];
		int C = tr[2];

		double S = a * b * Math.sin( Math.toRadians(C) ) / 2;
		double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)
							- 2 * a * b * Math.cos( Math.toRadians(C) ));
		double h = 2 * S / a;

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);

		sc.close();

	}
}
