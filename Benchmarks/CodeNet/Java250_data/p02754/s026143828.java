//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long b = N/(A+B)*A;
		long nokori = N%(A+B);
		long b2=0;
		if(nokori>=A) {
			b2 = A;
		}
		if(nokori<A) {
			b2 = nokori;
		}
		System.out.println(b+b2);
	}
}