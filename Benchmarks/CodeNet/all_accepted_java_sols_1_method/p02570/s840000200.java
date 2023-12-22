import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		if(d<=s*t) System.out.println("Yes");
		else System.out.println("No");
	}
}