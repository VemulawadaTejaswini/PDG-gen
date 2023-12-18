import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();

		int ans = T.length();

		for(int i=0; i <= S.length()-T.length(); i++) {
			String SWk = S.substring(i, i+T.length());
			int cnt = 0;
			for(int j=0; j < T.length(); j++) {
				if(SWk.charAt(j) != T.charAt(j)) {
					cnt++;
				}
			}
			if(ans > cnt) {
				ans = cnt;
			}
		}

		System.out.println(ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
