import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    String s = "ACL";
    StringBuilder out = new StringBuilder();
    for (int i = 0; i < K; i++) out.append(s);
    System.out.println(out);
  }
}
