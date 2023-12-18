import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	long x = sc.nextLong();
      	long k = sc.nextLong();
      	long d = sc.nextLong();
      	long ans;
      	x = Math.abs(x);
      	if(x/d > k){
          	ans = x - d*k;
        }else{
        	long e = x/d;
          	k -= e;
          	x -= e*d;
          	if(k%2 == 1) x = Math.abs(x-d);
          	ans = x;
        }
      	System.out.println(ans);
    }
}