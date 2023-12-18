import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	long n = sc.nextLong();
	   	long k = sc.nextLong();
	   	long mod = 1000000007L;
	   	long sum = 0;
	   	long min = 0;
	   	long max = 0;
	   	for(long i = k; i <= n+1; i++) {
	   		min = i*(i-1)/2;
	   		max = i*(2*n-(i-1))/2;
	   		sum+=(max-min+1)%mod;
	   	} 		
	   	System.out.println(sum%mod);
	 }
}