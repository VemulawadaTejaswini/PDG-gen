import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		String[] a = { "A", "C", "G", "T" };

		int cnt = 0;
		int maxCnt = 0;
		boolean flg = false;
		boolean bflg = false;
		for (int i = 0; i < S.length(); i++) {
			if(!flg) {
				cnt = 0;
			}
			flg = false;
			for (int j = 0; j < a.length; j++) {
				if (String.valueOf(S.charAt(i)).equals(a[j])) {
					cnt++;
					maxCnt = Math.max(cnt, maxCnt);
					flg = true;
					break;
				}
			}
			
		}
		System.out.println(maxCnt);

	}

}
