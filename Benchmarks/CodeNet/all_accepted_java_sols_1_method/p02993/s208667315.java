
import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      String N = sc.next();
      
      for(int i=1;i<N.length();i++) {
    	  if(N.substring(i-1, i).equals(N.substring(i,i+1))) {
    		  cnt = 1;
    	  }
      }
      
      if(cnt==1) {
    	  System.out.println("Bad");
      } else {
    	  System.out.println("Good");    	  
      }
  }
 
}