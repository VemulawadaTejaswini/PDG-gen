import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		if(h2==0) {
			h2=24;
		}
		int k = sc.nextInt();
		int H = h2-h1;
		int M = m2-m1;
		System.out.println(H*60+M-k);
	 }
}
