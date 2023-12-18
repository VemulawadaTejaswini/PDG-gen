//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==B&&B!=C||A==C&&A!=B||B==C&&B!=A) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}