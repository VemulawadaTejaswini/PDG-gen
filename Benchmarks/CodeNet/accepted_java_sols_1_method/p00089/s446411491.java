import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		int dp1[];
		int dp2[];

		str = sc.next().split(",");
		dp1 = new int[str.length];
		dp1[0] = Integer.valueOf(str[0]);
		while (sc.hasNext()) {
			str = sc.next().split(",");
			dp2 = new int[str.length];
			if (dp1.length < dp2.length) {
				for (int i = 0; i < str.length; i++) {
					if (i == 0) {
						dp2[i] = dp1[0] + Integer.valueOf(str[0]);
					} else if (i == str.length - 1) {
						dp2[i] = dp1[dp1.length - 1] + Integer.valueOf(str[str.length - 1]);
					} else {
						dp2[i] = Math.max(dp1[i - 1], dp1[i]) + Integer.valueOf(str[i]);
					}
				}
			} else {
				for (int i = 0; i < str.length; i++) {
					dp2[i] = Math.max(dp1[i + 1], dp1[i]) + Integer.valueOf(str[i]);
				}
			}
			dp1 = dp2;
		}
		System.out.println(dp1[0]);
	}
}