import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		String ans = "No";
		if ( A == B && A != C ) {
			ans = "Yes";
		} else if ( A == C && A != B ) {
			ans = "Yes";
		} else if ( B == C && A != B ) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
