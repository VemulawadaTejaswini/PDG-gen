import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		String ans = "";

		if (A == B) {
			ans ="Draw";
		} else if (A == 1 && B != 1) {
			ans = "Alice";
		} else if (B == 1 && A != 1) {
			ans = "Bob";
		} else if(A < B) {
			ans = "Bob";
		} else if (B < A) {
			ans = "Alice";
		}
		System.out.println( ans );
	}
}