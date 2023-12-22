import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 0;
		while ((N = sc.nextInt()) != 0) {
			int A = 0, B = 0;
			for (int i = 0 ; i < N ; i++) {
				int a = sc.nextInt(), b = sc.nextInt();
				if (a == b) {
					A += a; B += b;
				} else if (a < b) {
					B += a+b;
				} else {
					A += a+b;
				}
			}
			System.out.println(A+" "+B);
		}
	}
}