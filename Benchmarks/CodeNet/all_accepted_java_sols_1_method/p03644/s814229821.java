import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      for(int i = 6 ; i >=0 ; i--){
          if(Math.pow(2,i)<=x){
            System.out.println((int)Math.pow(2,i));
            break;
          }
      }
    }
}