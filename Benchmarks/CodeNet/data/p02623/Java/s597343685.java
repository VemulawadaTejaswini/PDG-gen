import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n + 1];
		long[] b = new long[m + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = a[i - 1] + sc.nextInt();
		}
		for (int i = 1; i <= m; i++) {
			b[i] = b[i - 1] + sc.nextInt();
		}
      
		int max = 0;
		for (int i = 0; i <= n; i++) {
			int j = m;
			while (j >= 0 && k < a[i] + b[j]) j--;
			if (j < 0) break;
			max = Math.max(max, i + j);
		}
		System.out.println(max);
	}
}