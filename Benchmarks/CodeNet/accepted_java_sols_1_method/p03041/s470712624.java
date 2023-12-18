import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();
    StringBuilder SS = new StringBuilder(S);
    String s = String.valueOf(S.charAt(K-1)).toLowerCase();
    System.out.println(SS.replace(K-1,K,s).toString());
  }
}