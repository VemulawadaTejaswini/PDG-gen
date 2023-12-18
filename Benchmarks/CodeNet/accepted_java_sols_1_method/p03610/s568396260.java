import java.util.*;
import java.math.BigInteger;
 class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      String s = scan.next() ;
      char[] c = s.toCharArray() ;
      for(int i= 0 ; i<c.length ; i++){
          if(i%2==0){
              System.out.print(c[i]+"");
          }
      }
    }
}