//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U= sc.next();
		//System.out.println(U);
		//System.out.println(A-1);
		if(U.contentEquals(S)) {
			System.out.print((A-1)+" "+B);
			//System.out.print(B);
		}
		if(U.contentEquals(T)) {
			System.out.print(A+" "+(B-1));
			//System.out.print(B-1);
		}
	}
}