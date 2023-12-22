import java.util.Scanner;
public class Main {
 public static void main(String[] a) {
   Scanner in = new Scanner(System.in);
   char[] s = in.next().toCharArray();
   if (s[2] == s[3] && s[4] == s[5]) {
     System.out.println("Yes");
   }
   else {
     System.out.println("No");
   }
 }
}