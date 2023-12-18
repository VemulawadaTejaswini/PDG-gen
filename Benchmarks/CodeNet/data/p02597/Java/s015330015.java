import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] c = new char[n];
		c = sc.next().toCharArray();
		int count = 0;
		int r = 0;
		for(int i = 0; i < n; i++) {
			if(c[i]=='R')r++;
		}
		for(int i = 0; i < r; i++) {
			if(c[i]=='W')count++;
		}
		System.out.println(count);
    }
}