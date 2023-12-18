import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Double n1, n2;
		
		n = sc.nextInt();
		while (n != -1) {
			n1 = n * 1.0 / 2;
			n2 = n1 - (n1 * n1 * n1 - n) / (3 * n1 * n1);
			while (0.000001 * n <= Math.abs(n2 * n2 * n2 - n)) {
				n1 = n2;
				n2 = n1 - (n1 * n1 * n1 - n) / (3 * n1 * n1);
			}
			System.out.printf("%.6f\n", n2);
			n = sc.nextInt();
		}
	}
}