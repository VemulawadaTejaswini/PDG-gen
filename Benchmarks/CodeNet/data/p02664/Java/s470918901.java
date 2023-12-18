import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値保持
		String sin = sc.next();
		String ans = sin.replaceAll("?", "D");
		// 結果出力
		System.out.println(ans);
	}
}