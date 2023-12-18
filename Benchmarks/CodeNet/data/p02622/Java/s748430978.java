import java.util.*;
public class Main{
  public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);//文字の入力
		String S = sc.next();
		String T = sc.next();
		int count = S.length();//何文字かをcountに代入

		for (int i = 0; i < S.length(); i++) {
			//Objects.equals(a,b);で文字列の比較
			if (Objects.equals(S.substring(i, i + 1), T.substring(i, i + 1))) {
				count -= 1;
			}
		}
		System.out.println(count);
	}
}