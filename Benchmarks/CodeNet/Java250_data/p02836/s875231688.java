//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	static boolean[] targetNumbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = S.length();
		int count = 0;
		for (int i=0; i<n/2; i++) {
			if (S.charAt(i)!=S.charAt(n-i-1)) {
				count ++;
			}
		}
		System.out.println(count);
	}
}