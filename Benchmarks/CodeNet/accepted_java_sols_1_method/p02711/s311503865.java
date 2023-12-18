import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String n = sc.next();

		if ( n.charAt(0)=='7' || n.charAt(1)=='7' || n.charAt(2)=='7' ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}