import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		for(int i = 1; i <= n; i++) {
			long y = n/i;
			ans+=y*(y+1)*i/2;
		}
		System.out.println(ans);
    }
}