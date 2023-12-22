import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		boolean able = true;
		if((x[0]+y[0])<=t[0]&&(x[0]+y[0])%2==t[0]%2) {
			for(int i = 1; i < n; i++) {
				long d = Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1]);
				long time = t[i]-t[i-1];
				if(d<=time&&d%2==time%2) {
					continue;
				}
				else {
					able = false;
					break;
				}
			}
			System.out.println(able ?  "Yes":"No");
		}
		else System.out.println("No");
	}
}