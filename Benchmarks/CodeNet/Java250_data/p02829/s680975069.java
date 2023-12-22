//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	static boolean[] targetNumbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A+B==3) {
			System.out.println(3);
		}else if(A+B==4) {
			System.out.println(2);
		}else {
			System.out.println(1);
		}
	}
}