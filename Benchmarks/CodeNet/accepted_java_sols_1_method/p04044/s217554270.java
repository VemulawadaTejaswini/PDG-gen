import java.util.Arrays;
import java.util.Scanner;
//B - 文字列大好きいろはちゃんイージー / Iroha Loves Strings (ABC Edition)

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next()); //StringをIntに変換する
		int l = Integer.parseInt(sc.next());

		String[] ans = new String[n];
		for (int i=0; i< n; i++) {
			ans[i] = sc.next();
		}

		Arrays.sort(ans); //昇順で並べ替え

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}
}
