import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String org = sc.next();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < org.length(); i++) {
      char c = org.charAt(i);
      if (i == K - 1) {
        c = (char) ('a' + (int)c - 'A');
      }
      builder.append(c);
    }
    System.out.println(builder.toString());
    //System.out.println(Arrays.toString(array));
  }
}