import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      sc.close();
      
      String answer = new String();
      
      if (A <= 8 && B <= 8) {
        answer = "Yay!";
      } else {
        answer = ":(";
      }

      System.out.println(answer);
    }
}