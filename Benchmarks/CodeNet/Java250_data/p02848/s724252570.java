import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		String org = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String con;
		String t = "";
		if ( n == 0 || n == 26 ) {
			// 出力
			System.out.println(s);
		} else {
			con = org.substring(n);
			con = con.concat(org.substring(0,n));
		// 
			for ( int i = 0 ; i < s.length() ; i++ ) {
				String c = String.valueOf(s.charAt(i));
				int ps = org.indexOf(c);
				t = t.concat(String.valueOf(con.charAt(ps)));
			}
			// 出力
			System.out.println(t);
		}
	}
}

