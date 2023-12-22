import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      Long n = sc.nextLong();
      boolean found = false;
      int ans = 0;
      for(int i = 0;i < Math.min(s.length(),n);i++){
          if(s.charAt(i) != '1'){
              ans = Character.getNumericValue(s.charAt(i));
              found = true;
           	  System.out.println(ans);
              break;
          }
      }
      //sが全て1のとき
      if(!found){System.out.println('1');}
    }  
}