import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		long b[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[a[i]-1]++;
		}
		for(int i = 0; i < n; i++) {
			sum+=b[i]*(b[i]-1)/2;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(sum-b[a[i]-1]+1);
		}
		
	}
}