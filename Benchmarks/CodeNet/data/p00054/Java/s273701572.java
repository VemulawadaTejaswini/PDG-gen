import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextDouble()){
			BigDecimal a=sc.nextBigDecimal(), b=sc.nextBigDecimal();
			int n=sc.nextInt();
			String d=a.divide(b,n+1,0).toString();

			int i=0, ans=0;
			while(d.charAt(i) != '.') i++;
			while(n-- > 0) ans += d.charAt(++i) - '0';
			System.out.println(ans);
		}
	}
}