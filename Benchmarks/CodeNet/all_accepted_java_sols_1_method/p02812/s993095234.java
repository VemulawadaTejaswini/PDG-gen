//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String find = "ABC";
		int count = 0;
		if(S.contains(find)) {
			//count ++;
			for(int i=2;i<N;i++) {
				if(S.charAt(i-2)=='A'&&S.charAt(i-1)=='B'&&S.charAt(i)=='C') {
					count ++;
				}
			}
		}
		System.out.println(count);
		
	}
}