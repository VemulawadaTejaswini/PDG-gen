import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();

		String ab = "abcdefghijklmnopqrstuvwxyz";

		int i = ab.indexOf(s) + 1;

		// 出力
		System.out.println(ab.charAt(i));
	}
}