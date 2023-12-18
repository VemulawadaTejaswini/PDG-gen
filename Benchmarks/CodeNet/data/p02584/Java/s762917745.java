import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long x = sc.nextLong();
	    long k = sc.nextLong();
	    long d = sc.nextLong();
	    if(x==k&&k==d)
	    System.out.println(x);
	    else if(x-k*d<0){
	        long n = x/d;
	        long rem = k - n;
	        if(rem%2==0){
	            System.out.println(x - rem*d);
	        }
	        else{
	            long ans1 = x+d-rem*d;
	            long ans2 = (long)Math.abs(x-d-rem*d);
	            System.out.println(Math.min(ans1,ans2));
	        }
	    }
	    else{
	        System.out.println(x-k*d);
	    }
    } 
    
}
