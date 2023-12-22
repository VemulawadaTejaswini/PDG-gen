import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  double Sum=0;
	  long S1=0,S2=0;
      long N = sc.nextLong();
      long[] a = new long[(int)N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextLong();
          Sum=Sum+a[i];
      }
 
      for (int i=0 ; i<N; i++) {
    	  S1 = S1 + a[i];
    	  if(S1>=Sum/2) {
    		  S2=S1-a[i];
    		  break;
    	  }
      }
      
      
	  System.out.println((long)Math.min(2*S1-Sum, Sum-2*S2));
  }
  
 
}