import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		String nStr = "";
		String mStr = "";

		for (int i = 0; i < m; i++) {
			nStr += n;
		}

		for (int i = 0; i < n; i++) {
			mStr += m;
		}
		String re = mStr;

		if (nStr.compareTo(mStr) < 0) {
			re = nStr;
		}

		System.out.println(re);

	}

}