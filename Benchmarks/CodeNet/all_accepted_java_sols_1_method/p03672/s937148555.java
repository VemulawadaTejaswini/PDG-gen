import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans =-1;
		int l = s.length();
		while(ans == -1) {
			l--;
			if(l%2==0&&s.substring(0, l/2-1).equals(s.substring(l/2, l-1))) {
				ans = l;
				break;
			}
		}
		System.out.println(ans);
	 }
}