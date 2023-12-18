import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long q = sc.nextLong();
      long h = sc.nextLong();
      long s = sc.nextLong();
      long d = sc.nextLong();
      long n = sc.nextLong();
      if(n%2==0)System.out.println(Math.min(q*4*n,Math.min(h*2*n,Math.min(s*n,d*n/2))));
      else System.out.println(Math.min(q*4*n,Math.min(h*2*n,Math.min(s*n,d*(n/2)+Math.min(q*4,Math.min(h*2,s))))));
    }
}
