import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main {
	
	
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        int count=0;
        int now = 1;
        while(now!=2&&count<=n+1) {
        	now = a[now-1];
        	count++;
        }
        if(now != 2) {
            System.out.println(-1);
        }
        else {
        	System.out.println(count);
        }
	}
}