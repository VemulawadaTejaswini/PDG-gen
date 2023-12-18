import java.util.*;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal A = sc.nextBigInteger();
		BigDecimal B = new BigDecimal(sc.nextDouble());
		System.out.print(A.multiply(B));
	}
}
