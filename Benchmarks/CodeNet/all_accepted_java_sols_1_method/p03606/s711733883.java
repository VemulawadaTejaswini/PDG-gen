import java.util.*;
import java.math.BigInteger;
 class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      int[] c = new int[n] ;
      int[] d = new int[n] ;
      
      for(int i = 0 ; i<n ; i++){
          c[i] = scan.nextInt();
          d[i] =scan.nextInt() ;
      }
      int sum = 0 ; 
      for(int i = 0 ; i<n ; i++){
          sum+= d[i] - c[i] +1 ;
      }
      System.out.println(sum) ; 
    }
}