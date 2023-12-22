import java.util.*;
 
public class Main {
 
  public static void main(String args[]) {
   
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    String strA = String.valueOf(a);
    String strB = String.valueOf(b);
    String answer = "";
    
    if (a == b || a < b) {

       while (b > 0) {
        answer = answer.concat(strA);
        b--;
      }
      System.out.println(answer);
 
    } else {
      
             while (a > 0) {
          answer = answer.concat(strB);
          a--;
       }

     System.out.println(answer);
    }
 
  }
}