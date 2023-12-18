import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	 public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   long n = sc.nextLong();
	   long ans = 0;
	   if(n>=2) {
		   ans= n*(n-1)/2;
	   }
	   System.out.println(ans);
	}
}