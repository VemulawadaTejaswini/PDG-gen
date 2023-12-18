import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "";
    char[] ss = s.toCharArray();
    for (int i=0; i<s.length(); i += 2) {
      System.out.print(ss[i]);
    }
  }
}