import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      int sum = 0;
      String s;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      y = scanner.nextInt();
      s = scanner.next();
      scanner.close();

      String s1 = null;
      if (y-1>-1) {
         s1 = s.substring(0,y-1);
      }
      char s4 = s.charAt(y-1);
      String s3 = null;
      if (y<s.length()) {
         s3 = s.substring(y,s.length());
      }
      String s2 = String.valueOf(s4);
      s2 = s2.toLowerCase();
      if (s1 != null && s3 != null) {
         System.out.println(s1 + s2 + s3);
      } else if (s1 != null) {
         System.out.println(s1 + s2);
      } else if (s3 != null) {
         System.out.println(s2 + s3);
      } else{
         System.out.println(s2);
      }
   }
}
