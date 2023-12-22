import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();

		int ans = T.length();

		for (int start = 0; start <= S.length() - T.length(); start ++) {

			int diff = 0;

			for (int i = 0; i < T.length(); i++) {
				if (T.charAt(i) != S.charAt(start + i)){
					diff++;
				}
			}
			ans = Math.min(ans, diff);
		}

		System.out.println(ans);
	}


}