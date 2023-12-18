import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] L = new long[n];
		List<Long> memo = new ArrayList<Long>();
		int count = 0; 
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			L[i]=a;
		}
		Arrays.sort(L);
		for(int i = 0; i < n-2; i++) {
			long r = L[i];
			for(int j = i+1; j < n-1; j++) {
				long l = L[j];
				for(int k = j+1; k < n; k++) {
					long now = L[k];
					if(r!=now&&l!=now&&r!=l&&r+l>now&&r+now>l&&l+now>r) count++;
				}
			}
		}
		System.out.println(count);
    }
}