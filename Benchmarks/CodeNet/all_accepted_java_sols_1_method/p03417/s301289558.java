import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long M = scn.nextLong();
		long ans = 0;
		if (N < 3 || M < 3) {
			if (N == 1) {
				if (M == 1) {
					ans = 1;
				} else {
					ans = M - 2;
				}
			} else {
				if (M == 1) {
					ans = N - 2;
				} else {
					ans = 0;
				}
			}
		} else {
			ans = (N - 2) * (M - 2);

		}
		System.out.println(ans);

	}

}
