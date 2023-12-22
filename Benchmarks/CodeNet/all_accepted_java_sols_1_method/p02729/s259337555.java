import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();
		int m = sca.nextInt();

		// n個から2個
		int ans_n = (n*(n-1))/2;

		// m個から2個
		int ans_m = (m*(m-1))/2;

		int ans = ans_n + ans_m;

		System.out.println(ans);

		// 後始末
		sca.close();
	}
}