import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		int d = a/b;
		int r = a%b;
		BigDecimal aBd = new BigDecimal(a);
		BigDecimal bBd = new BigDecimal(b);
		
		BigDecimal f =aBd.divide(bBd, ROUND_HALF_DOWN);
		System.out.println(d+" "+r+" "+f.doubleValue());
	}
}
		