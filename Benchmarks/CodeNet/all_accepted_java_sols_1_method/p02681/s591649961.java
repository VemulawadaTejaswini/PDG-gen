import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = t.length();
		if((t.substring(0, n-1)).equals(s)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	 }
}