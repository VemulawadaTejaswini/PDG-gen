import java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    String s = S.nextLine();
    String t = S.nextLine();

    String p = t.replaceFirst(".$", "");
     if (s.equals(p)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}

