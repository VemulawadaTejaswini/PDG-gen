import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int l = t.length;
		int min = l;
			for(int i = 0; i < s.length-l+1; i++) {
				int count = 0;
				for(int j = 0; j < l; j++) {
					if(s[i+j]!=t[j])count++;
				}
				if(count<min)min=count;
			}
			System.out.println(min);
	}
}