import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
     Scanner input = new Scanner(System.in);
  
     while (input.hasNext()) {
        String S = input.next();
        int ans = 0;
       
        for (int i = 0; i < S.length(); ++i) {
          if (S.charAt(i) == '-') {
            --ans;
          } else if (S.charAt(i) == '+') {
            ++ans;
          }
        }
        
        System.out.println(ans);
      }
  }
}