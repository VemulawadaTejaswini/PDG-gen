import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		String t = sc.next();
		String u = "";
		for ( int i = 0 ; i < n ; i++) {
			String a = String.valueOf(s.charAt(i));
			u = u.concat(a);
			a = String.valueOf(t.charAt(i));
			u = u.concat(a);
		} 
		System.out.println(u);
	}
}