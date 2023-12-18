import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String S = in.next();
         String T = in.next();
         if(Math.abs(S.length() - T.length()) != 1) {
             System.out.println("No");
             return;
         }
         int length = Math.min(S.length(), T.length());
         for(int i = 0; i < length; i++) {
             if(S.charAt(i) != T.charAt(i)) {
                 System.out.println("No");
                 return;
             }
         }
         System.out.println("Yes");
    }
}
