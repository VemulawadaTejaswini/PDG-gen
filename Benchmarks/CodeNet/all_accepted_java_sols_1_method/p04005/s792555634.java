import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      if(a%2==0)System.out.println(0);
      else if(b%2==0)System.out.println(0);
      else if(c%2==0)System.out.println(0);
      else{
      	long x = Math.max(a,Math.max(b,c));
        long y = Math.min(a,Math.min(b,c));
        long z = a+b+c-x-y;
        System.out.println(y*z);
      }
    }
}