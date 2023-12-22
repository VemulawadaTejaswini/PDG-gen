import java.util.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    sc.close();

    String s = S.replaceAll("ABC", "");
    long ans = (S.length() - s.length()) / 3;
    System.out.println(ans);
  }
}