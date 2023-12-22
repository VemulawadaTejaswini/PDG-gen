import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    int cnt = s.length();
    String x = "";
    for (int i = 0; i < cnt; ++i){
      x += "x";
    }

      System.out.println(x);
  }
}