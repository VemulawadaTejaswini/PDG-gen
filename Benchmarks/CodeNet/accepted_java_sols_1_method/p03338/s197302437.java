import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int max = 0;
		for(int i = 1; i <= n-1; i++) {
			int c = i;
			int count = 0;
			for(char j = 'a'; j <= 'z'; j++) {
				boolean l = false;
				boolean r = false;
				for(int k = 0; k < c; k++) {
					if(s.charAt(k)==j){
						l = true;
						break;
					}
				}
				for(int k =c; k < n; k++) {
					if(s.charAt(k)==j){
						r = true;
						break;
					}
				}
				if(l&&r) count++;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
}