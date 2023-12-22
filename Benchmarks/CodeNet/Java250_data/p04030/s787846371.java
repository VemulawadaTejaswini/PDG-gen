import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int bufIdx = 0;
    char[] buf = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '0' || c == '1') {
        buf[bufIdx] = c;
        bufIdx++;
      } else if (c == 'B' && bufIdx != 0) {
        bufIdx--;
      }
    }
    
    for (int i = 0; i < bufIdx; i++) {
      System.out.print(buf[i]);
    }
    System.out.println();
  }
}