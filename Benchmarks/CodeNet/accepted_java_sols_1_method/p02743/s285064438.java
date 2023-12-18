import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.LoggingMXBean;

/**
 * @author wuyue
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();
		
//		int nn = (int) Math.sqrt(n);
//		int mm = (int) Math.sqrt(m);
//		int kk = (int) Math.sqrt(k);
//		if (nn + mm < kk) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
		 
		if (k - m- n>0 && (k-m-n) *(k-m-n) > 4*n*m) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		
		
		
	}

}
