import java.util.*;
import java.math.BigInteger;
 class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      int c = scan.nextInt() ;
      int sum = 1 ; 
      for(int i =0 ;i<n  ;i++){
          if(sum*2 < sum+c){
              sum*=2 ;
          }else{
              sum+=c ;
          }
      }
      System.out.println(sum) ;
    }
}