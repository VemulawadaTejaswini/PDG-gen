//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long K = sc.nextLong();
		if(A>=K) {
			System.out.println((A-K)+" "+B);
		}else if(A<K&&K<A+B) {
			System.out.println(0+" "+(B-(K-A)));
		}else {
			System.out.println(0+" "+0);
		}
		
	}
}