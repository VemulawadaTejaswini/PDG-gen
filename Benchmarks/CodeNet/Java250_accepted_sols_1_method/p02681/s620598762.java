import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
		String t = sc.next();

		// 出力
		System.out.println(s.equals(t.substring(0, s.length())) ? "Yes" : "No");
		sc.close();
	}
}
