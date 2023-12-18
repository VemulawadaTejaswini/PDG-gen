import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    char[] chars = str.toCharArray();
    for (int i = chars.length -1; i >= 0; i--) {
      System.out.print(chars[i]);
      if (i == 0) {
        System.out.print("\n");
      }   
    }   
  }
}