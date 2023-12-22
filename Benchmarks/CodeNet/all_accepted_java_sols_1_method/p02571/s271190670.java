import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] S = sc.next().split("");
    String[] T = sc.next().split("");
    int ans = T.length;
    for (int i = 0; i < S.length-T.length+1; i++) {
      int t = T.length;
      for (int j = 0; j < T.length; j++) {
        if (S[i+j].equals(T[j])) t--;
      }
      ans = Math.min(ans, t);
    }
    System.out.println(ans);
  }
}