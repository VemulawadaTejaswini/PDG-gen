import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n, result, flag = 0, zero = 0 ;
		n = sc.nextInt() ;
		BigInteger val = BigInteger.valueOf(1), check = new BigInteger("1000000000000000000"), x ;
		for (int i = 0; i < n; i++) {
			x = sc.nextBigInteger() ;
			if (x.compareTo(BigInteger.valueOf(0)) == 0) {
				zero = 1 ;
				break ;
			}
			if (flag == 0) {
				val = val.multiply(x) ;
				result = val.compareTo(check) ;
				if (result == 1) {
					flag = 1 ;
				}
			}
		}
		if (zero == 1)	System.out.print(0) ;
		else {
			if (flag == 1)	System.out.println(-1) ;
			else	System.out.println(val) ;
		}
		System.gc(); 
	}
}
