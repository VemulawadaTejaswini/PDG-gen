import java.util.*;
import java.math.*;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		int d=a/b;
		int r=a%b;
		
		BigDecimal aBig = new BigDecimal(a);
		BigDecimal bBig = new BigDecimal(b);
		BigDecimal fBig = aBig.divide(bBig,5,ROUND_HALF_EVEN);
		System.out.println(d+" "+r+" "+fBig.toPlainString());
	}
}