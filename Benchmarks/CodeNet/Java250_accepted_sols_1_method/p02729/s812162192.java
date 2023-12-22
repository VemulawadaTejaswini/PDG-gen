import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
      
      int m = sc.nextInt();
      int n = sc.nextInt();
      
      if (m > 0 && n > 0) {
     
        int mm = m * (m - 1) / 2 ;
        int nn = n * (n - 1) / 2 ;

        System.out.println(mm + nn);
      
      } else if (m == 0 && n > 0) {
     	int mm = m ;
        int nn = n * (n - 1) / 2 ;

        System.out.println(mm + nn);	
      } else if (m > 0 && n == 0) {
        int mm = m * (m - 1) / 2 ;
        int nn = n ;

        System.out.println(mm + nn);
      } else {

        System.out.println(m + n);
      }
   }        
}
