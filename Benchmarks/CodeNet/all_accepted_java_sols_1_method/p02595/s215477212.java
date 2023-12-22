import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long d = sc.nextLong();
		int c=0;
		while(n-->0){
		    long x  = sc.nextLong();
		    long y = sc.nextLong();
		    double p = Math.sqrt(x*x + y*y);
		    if(p<=d) c++;
		}
		System.out.println(c);
	}
}
