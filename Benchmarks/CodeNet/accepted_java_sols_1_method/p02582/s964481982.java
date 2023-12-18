import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.nextLine();
		int ans = 0;

		for(int i=0; i<3; i++) {
			if(S.charAt(i) == 'S') {
				if(ans != 0) {
					break;
				}
			} else if(S.charAt(i) == 'R') {
				ans++;
			}
		}
		// 出力
		System.out.println(ans);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
