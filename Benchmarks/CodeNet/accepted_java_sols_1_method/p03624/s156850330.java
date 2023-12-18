import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      String s = scan.next() ;
      char[] cd = s.toCharArray() ;
      ArrayList<Character> a = new ArrayList<>() ;
      for(int i = 0 ; i<s.length() ; i++){
          a.add(cd[i]);
      }
      
      int count = 0 ;
      char i ;
      for( i = 'a' ; i<= 'z' ; i++ ){
          if(!a.contains(i)){
              count++ ;
              break ;
          }
      }
      if(count == 0){
          System.out.println("None");
      }else{
          System.out.println(i);
      }
    }
}