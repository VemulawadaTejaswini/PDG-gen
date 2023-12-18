
import java.util.*;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String input =sc.next();    
    String[] ar = input.split("");
      boolean isGood = true;
    int i = 1;
      
        for (String value : ar) {
            if (i%2 == 0) {
                if (value.equals("L") || value.equals("U") || value.equals("D") ){
                    i++;
                    continue;
                } else {
                    isGood =false;
                    break ;
                }
            
            
            } else {
                if (value.equals("R") || value.equals("U") || value.equals("D") ){
                    i++;
                    continue;
                } else {
                    isGood =false;
                    break ;
                }
            }
        }
      if (isGood) {
         System.out.println("Yes");
      } else {
          System.out.println("No");
      }
    
  }
}
