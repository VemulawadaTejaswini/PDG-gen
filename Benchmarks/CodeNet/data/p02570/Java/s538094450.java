import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int D = input.nextInt();
      int T = input.nextInt();
      int S = input.nextInt();

      int ans = D / S;
      if(ans > T) {
         System.out.println("No");
      }  else if(ans < T | ans == T) {
         System.out.println("Yes");
      }

   }
   
}