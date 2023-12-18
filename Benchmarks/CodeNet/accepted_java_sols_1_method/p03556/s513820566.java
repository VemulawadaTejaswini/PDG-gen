import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
        for(int i = n ; i>=0 ; i--){
            if(Math.sqrt(i) - (int)Math.sqrt(i) == 0 ){
                System.out.println(i);break;
            }
        }
      }
}