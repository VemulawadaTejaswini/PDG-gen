import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      
      int[] n = new int[26];
      int nAscii;
      
      while(sc.hasNext()){
         str = sc.nextLine();
         str = str.toLowerCase();
         for(int i = 0; i < str.length(); i ++){
            nAscii = str.charAt(i);
         
            if(nAscii > 122 || nAscii < 97){
               continue;
            }else{
               n[nAscii - 97] ++;
            }
         }
      }
      
      for(int i = 0; i < 26; i ++){
         System.out.println((char)(i + 97) + " : " + n[i]);
      }
      
   }//main
}//class