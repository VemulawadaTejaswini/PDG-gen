import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();
		int ans = 0;

		for(int i=0; i<3; i++) {
			if(S.charAt(i) == T.charAt(i)) {
				ans++;
			}
		}
		// 出力
		System.out.println(ans);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
