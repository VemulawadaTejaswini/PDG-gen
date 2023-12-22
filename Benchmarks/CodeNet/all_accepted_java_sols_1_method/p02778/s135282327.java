import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();

		String t = "";
		for ( int i=0; i<s.length(); i++ ) {
			t = t.concat("x");
		}
		System.out.println(t);
	}
}