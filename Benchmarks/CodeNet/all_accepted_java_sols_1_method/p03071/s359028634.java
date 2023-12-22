import java.util.Scanner;

//AtCoder Beginner Contest 124
//A	Buttons
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans = 0;
		if (A > B) {
			ans += A;
			A--;
		} else {
			ans += B;
			B--;
		}
		if (A > B) {
			ans += A;
			A--;
		} else {
			ans += B;
			B--;
		}

		System.out.print(ans);
	}
}
