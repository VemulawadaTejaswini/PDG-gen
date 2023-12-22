import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int shift = sc.nextInt();
    String origin = sc.next();
    int limit = (int)'Z';
    StringBuilder out = new StringBuilder();
    for (int i = 0; i < origin.length(); i++) {
      int val = (int)origin.charAt(i) + shift;
      if (val > limit) val -= 26;
      out.append((char)val);
    }
    System.out.println(out.toString());
  }
}
