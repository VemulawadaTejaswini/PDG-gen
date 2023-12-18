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
		int k = sc.nextInt();
		int H = 0;
		if(h1>h2) {
			H = h2+12-h1;
		}
		else {
			H = h1-h2;
		}
		int M = m2-m1;
		System.out.println(H*60+M-k);
	 }
}