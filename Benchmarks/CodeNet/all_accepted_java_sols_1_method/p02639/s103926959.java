import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		for(int i = 1; i <= 5; i++) {
			int n = sc.nextInt();
			if(n==0) {
				ans=i;
			}
		}
		System.out.println(ans);
	 }
}
