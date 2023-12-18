import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
		sc.close();
		int len = s.length();
		String i18n = s.charAt(0) + Integer.toString(s.length()-2) + s.charAt(len-1);

		// 出力
		System.out.println(i18n);
	}

}
