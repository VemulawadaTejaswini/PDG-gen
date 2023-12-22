import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      long cnt2 =0;
      int flg=0;
      long N = sc.nextLong();
      long X = sc.nextLong();
      
      long[] a = new long[(int)N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextLong();
      }

      for(int i=0;i<N;i++) {
    	  if (cnt<=X) {
    		  cnt2++;
    	  } else {
    		  break;
    	  }
    	  cnt=cnt+a[i];
      }
      if(cnt<=X) {
    	  cnt2++;
      }
	  System.out.println(cnt2);
  }
  
 
}