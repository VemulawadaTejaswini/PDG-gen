import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String S = sc.next();
      char c = S.charAt(0);

      S = "abcdefghijklmnopqrstuvwxyz";
      char[] a = new char[26];
      for (int i = 0; i < a.length; i++) {
         a[i] = S.charAt(i);
      }

      char cb = a[0];

      for (int i = 0; i < a.length-1; i++) {
         if(c == a[i]){
            cb = a[i+1];
         }
      }

      System.out.println(cb);

   }
}