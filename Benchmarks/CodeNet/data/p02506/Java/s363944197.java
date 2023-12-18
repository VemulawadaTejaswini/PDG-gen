import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String t = in.next();
    int count = 0;
    for(String a = in.next(); !"END_OF_TEXT".equals(a); a = in.next()) {
      if(t.equals(a)) count++;
    }
    System.out.printf("%d\n", count);
  }
}