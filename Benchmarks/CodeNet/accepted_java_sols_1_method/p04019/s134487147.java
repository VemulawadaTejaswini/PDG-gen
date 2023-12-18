import java.util.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);                                            
      
      String S = sc.next();
      
      boolean isW = S.contains("W");
      boolean isE = S.contains("E");
      
      boolean isN = S.contains("N");
      boolean isS = S.contains("S");
      
      if((isW == false && isE == false || isW == true && isE == true) && ((isN == false && isS == false) || (isN == true && isS == true))){
          System.out.println("Yes");
      }else{
          System.out.println("No");
      }

   }   
        
 }