import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cnt = 0;
      int step = 0;
      String S = sc.next();
      String[] a = new String[4];
      int[] b = new int[4];
            
      for(int i=0; i<S.length(); i++) {
        if(i==0) {
        	a[0] = S.substring(i,i+1);
        	b[0] = b[0] + 1;
        } else {
        	if(S.substring(i,i+1).equals(a[0])) {
        		b[0] = b[0] + 1;
        	} 
        	else if (a[1]==null) {
        		a[1] = S.substring(i,i+1);
        		b[1] = 1;
        	}
        	else if (S.substring(i,i+1).equals(a[1])) {
        		b[1] = b[1] + 1;
        	}
        }
      }
      
      if(b[0]==2 && b[1]==2) {
    	  System.out.print("Yes");
      } else {
    	  System.out.print("No");
      }
  }  
}