import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		if(A > B) {
			ans += A;
			A--;
			if(A > B) {
				ans += A;
			} else {
				ans += B;
			}
		} else {
			ans += B;
			B--;
			if(A > B) {
				ans += A;
			} else {
				ans += B;
			}
		}
		System.out.println(ans);
	}
}
