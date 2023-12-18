import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int A = a * a;
			int B = b * b;
			int C = c * c;
			if (A + B == C || A + C == B || B + C == A ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
