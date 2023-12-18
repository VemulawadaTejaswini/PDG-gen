import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < s.length(); i++) {
        int charNum = s.charAt(i) - 'A';
        charNum = (charNum + n) % 26 + 'A';
        sb.append((char)charNum);
      }
      System.out.println(sb.toString());
  }
}