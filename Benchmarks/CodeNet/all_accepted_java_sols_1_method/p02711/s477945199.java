import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.close();

    String s = String.valueOf(N);
    boolean ans = s.contains("7");
    System.out.println(ans ? "Yes" : "No");
  }
}