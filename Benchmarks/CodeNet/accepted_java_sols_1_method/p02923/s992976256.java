import java.util.*;

class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long[] a = new long[(int)N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextLong();
      }
      long ans = 0;
      long cnt = 0;
      
      
      for (int i =(int)N-1;i>0;i--) {
    	  if(a[i]<=a[i-1]) {
    		  cnt++;
    	  } else {
    		  if(cnt>ans) {
    			  ans = cnt;
    		  }
    		  cnt=0;
    	  }
      }
	  if(cnt>ans) {
		  ans = cnt;
	  }

      
	  System.out.println(ans);
  }
  
 
}