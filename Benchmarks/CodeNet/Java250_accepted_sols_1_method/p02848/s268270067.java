import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      sc.nextLine();
      String s = sc.nextLine();
      
      String res = "";
      for(char c : s.toCharArray()) {
         res += (char)(((c - 'A') + N) % 26 + 65);
      }
      System.out.println(res);
   }
}