import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  long N = sc.nextLong();
	  long rute = (long)Math.sqrt(N);
	  long a = 0, b = 0;
	  
	  for(long r = rute; r>0; r--) {
		  if (N % r == 0) {
			  a = r;
			  b = N / a;
			  break;
		  }
	  }
	  long ans = (a-1)+(b-1);
	  out.println(ans);
		  
	}
  }	