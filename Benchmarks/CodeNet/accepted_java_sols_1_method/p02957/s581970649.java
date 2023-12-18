import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double K = (A + B) / 2;

		if (K == (int) K) System.out.println((int) K);
		else System.out.println("IMPOSSIBLE");
	}
}