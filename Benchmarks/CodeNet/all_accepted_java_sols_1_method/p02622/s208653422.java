import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String t = sc.next();
		
		
		int d=0;
		for( int i=0 ;i<s.length() ;i++ ) {
			if( s.charAt(i) != t.charAt(i)) {
				d++;
			}
		}
		System.out.println(d);
	}

}