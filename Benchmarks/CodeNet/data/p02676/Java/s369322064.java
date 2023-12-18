import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    String S = sc.next();
    String ret = S;
    if (S.length() > K) {
      ret = S.substring(0, K);
      ret += "...";
    }
    System.out.println(ret);
  }

}