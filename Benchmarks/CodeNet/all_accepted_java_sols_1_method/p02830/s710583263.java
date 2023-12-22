//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	static boolean[] targetNumbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		//System.out.println(S.charAt(0));
		
		for(int i=0;i<N;i++) {
			System.out.print(S.charAt(i));
			System.out.print(T.charAt(i));
		}
		
	}
}