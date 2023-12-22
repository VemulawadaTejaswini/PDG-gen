import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		if(s.length()<=k) {
			System.out.println(s);
		}
		else {
			s=s.substring(0, k);
			s+="...";
			System.out.println(s);
		}
	 }
}