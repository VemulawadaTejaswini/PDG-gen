
import java.util.*;

public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      long a =sc.nextLong();
      long b =sc.nextLong();
      long c =sc.nextLong();
      long k =sc.nextLong();
     
      
       if(k <= a+b ) {
    	   System.out.println(Math.min(a, k));
       }else {
    	   System.out.println(a - (k-a-b));
       }
	}
}