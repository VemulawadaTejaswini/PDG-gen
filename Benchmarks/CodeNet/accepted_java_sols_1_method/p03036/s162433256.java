import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x0 = sc.nextInt();
		int x[] = new int[11];
		x[0] = x0;

		for (int i = 0; i < 10; i++) {
			x[i+1] = r*x[i] - D;
		}
		for (int i = 1; i < 11; i++) {
			System.out.println(x[i]);
		}
	}
}
