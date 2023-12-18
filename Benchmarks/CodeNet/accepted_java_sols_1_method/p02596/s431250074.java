import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long seven = 7;
		long count = 0;
		long mod = 0;
		boolean able = false;
		for(int i = 0; i < k; i++) {
			mod=(mod*10+7)%k;
			count++;
			if(mod == 0) {
				able = true;
				break;
			}
		}
		System.out.println(able? count : -1);
    }
}