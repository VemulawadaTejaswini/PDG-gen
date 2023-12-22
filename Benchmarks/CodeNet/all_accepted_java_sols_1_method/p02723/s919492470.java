import java.util.*;

class Main {
  public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         String S = scanner.next();
         
         if(S.charAt(5) == S.charAt(4) && S.charAt(3) == S.charAt(2)){
             System.out.println("Yes");
         }
         else{
             System.out.println("No");
         }
         scanner.close();
  }
}