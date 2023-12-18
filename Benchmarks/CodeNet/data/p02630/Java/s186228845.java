import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] memo = new int[100000];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			memo[a-1]++;
		}
		int q = sc.nextInt();
		int b[] = new int[q];
		int c[] = new int[q];
		for(int i = 0; i < q; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			memo[c[i]-1]+=memo[b[i]-1];
			memo[b[i]-1]=0;
			long ans = 0;
			for(int j = 0; j < 100000; j++) {
				if(memo[j]!=0) {
					ans = ans + (j+1)*memo[j]; 
				}
			}
			System.out.println(ans);
		 }
		}
}