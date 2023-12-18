import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextBigDecimal()){
			BigDecimal a=sc.nextBigDecimal(), b=sc.nextBigDecimal();
			int n=sc.nextInt();
			String d=a.divide(b,n+2,0).toPlainString();

			int i=0, ans=0;
			while(d.charAt(i) != '.') i++;
			while(n-- > 0) ans += d.charAt(++i) - '0';
			System.out.println(ans);
		}
	}
}