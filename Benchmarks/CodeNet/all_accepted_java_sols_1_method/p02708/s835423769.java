
import java.util.*;

public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
   long n = sc.nextLong();
  long k = sc.nextLong();
  long pre = 0 ;
  long suf = n ;
  int d = 1 ; 

  for(int i = 1 ; i <k ; i ++ ) {
	  pre+=d;
	  suf += (n - d );
	  d++;
  }	
  
  long ans = 0  ; 
  long mod = 1000000007;
  for(long i = k ; i <=  n+1 ; i++) {
	  long range = (suf - pre +1);
	  ans = (ans%mod + range%mod)%mod ;
	  pre+=d;
	  suf += (n-d);
  d++;
  }
  System.out.println(ans);
	}

	
}