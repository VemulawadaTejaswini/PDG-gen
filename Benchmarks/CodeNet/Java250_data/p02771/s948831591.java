import java.util.Scanner;

//AtCoder Beginner Contest 155
//A	Poor
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		String ans = "No";
		if (A == B) {
			if (A != C) {
				ans = "Yes";
			}
		} else if (A == C) {
			if (A != B) {
				ans = "Yes";
			}
		} else if (B == C) {
			if (A != B) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}
