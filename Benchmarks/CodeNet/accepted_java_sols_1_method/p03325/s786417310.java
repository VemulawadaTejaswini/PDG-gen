import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n; i++){
			int now = a[i];
			while(now%2==0) {
				now/=2;
				count++;
			}
		}
		System.out.println(count);
	}
}