import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N;
		int a, b;
		while ((N = scn.nextInt()) != 0) {
			int A = 0, B = 0;
			for (int i = 0; i < N; i++) {
				a = scn.nextInt();
				b = scn.nextInt();
				if (a > b) {
					A += a + b;
				} else if (a < b) {
					B += a + b;
				} else {
					A += a;
					B += b;
				}
			}
			System.out.println(A + " " + B);
		}
	}
}

