import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
      	long y = 0, ans = 0;

        ans = (n / (a+b)) * a;
        y = n % (a+b);
      
        ans += Math.min(y, a);
      
      	System.out.println(ans);
    }
}