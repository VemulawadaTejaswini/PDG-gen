//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	static boolean[] targetNumbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[3];
		for(int i=0;i<3;i++) {
			A[i] = sc.nextInt();
		}
		int sum = 0;
		for(int j=0;j<3;j++) {
			sum += A[j];
		}
		if(sum>=22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
	}
}