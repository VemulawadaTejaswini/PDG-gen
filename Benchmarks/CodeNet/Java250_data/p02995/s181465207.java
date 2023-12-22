import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	long a = scan.nextLong() - 1;
      	long b = scan.nextLong();
      	long c = scan.nextLong();
      	long d = scan.nextLong();
      	long g = gcd(c,d);
      	long l = c * d / g;
      	long countb, counta;
      	countb = b - b/c - b/d + b/l;
      	counta = a - a/c - a/d + a/l;
        
      	System.out.print(countb - counta);
    }
  	public static long gcd(long m , long n){
      if(n == 0){
      	return m;
      }
      else{
        	return gcd(n, m%n);
      }
    }
 
}