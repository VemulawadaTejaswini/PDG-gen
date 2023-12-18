import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = -1;
    int b = -1;
    for(int i = 0; i < s.length() - 2; i++) {
      if(s.charAt(i) == s.charAt(i + 1)) {
        a = i + 1;
        b = i + 3;
      } else if(s.charAt(i) == s.charAt(i + 2)) {
        a = i + 1;
        b = i + 3;
      } else if(s.charAt(i + 1) == s.charAt(i + 2)) {
        a = i + 1;
        b = i + 3;
      }
    }
    if((s.length() == 2) && (s.charAt(0) == s.charAt(1))) {
      a = 1;
      b = 2;
    }
    System.out.println(a + " " + b);
  }
}