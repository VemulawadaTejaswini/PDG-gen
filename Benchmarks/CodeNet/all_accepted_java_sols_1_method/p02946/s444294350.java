import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		int n1 = X + (K-1);
		int n2 = X - (K-1);

		for (int i = n2; i <= n1; i++) {
			if (i != n1) {
				System.out.print(i + " ");
			} else {
				System.out.print(i);
			}
		}
	}
}