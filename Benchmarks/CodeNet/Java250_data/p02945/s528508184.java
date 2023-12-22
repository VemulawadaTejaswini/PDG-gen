import java.util.*;

public class Main {
  
 	public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
	  int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());
      
      int max = m*n;
      
      if(max < m+n) {
        max = m+n;
      }
      
      if(max < n-m) {
        max = n-m;
      }
      
      System.out.println(max);
    }
  
}