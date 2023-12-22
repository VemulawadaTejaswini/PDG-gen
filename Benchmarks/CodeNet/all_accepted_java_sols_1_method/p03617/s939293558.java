import java.util.*;
public class Main{
	public static final Scanner sc = new Scanner(System.in);
  	public static void main(String[] arg){
		 long a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
         long n=sc.nextInt();
         a *= 4;
         b *= 2;
         long small = Math.min(Math.min(a, b), c);
         long ans;
      	 ans = Math.min(small*n, d*(n/2) + small*(n%2));
         System.out.println(ans);
    }
}
