import java.util.*;
public class Main{
  Scanner sc = new Scanner(System.in);
		      int N = sc.nextInt();
		      long a = 1;
		      for(int i = 0; i < N; i++) {
		        a *= sc.nextLong();
		      }
		      if(a >= Math.pow(10, 18)){
		        System.out.println("-1");
		      } else {
		    	  System.out.println(a);
		      }
}