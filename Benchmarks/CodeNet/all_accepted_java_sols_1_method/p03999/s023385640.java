import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int len = S.length();
    long ans = 0;
    for(int i = 0; i < len; i++) {
      long d = Long.parseLong(String.valueOf(S.charAt(i)));
      for(int j = 0; j <= len - i - 1; j++) {
        if(j < len - i - 1) ans += (d * (long)Math.pow(10, j)) * (long)Math.pow(2, i) * (long)Math.pow(2, len - i - 2 - j);
        if(j == len - i - 1) ans += (d * (long)Math.pow(10, j)) * (long)Math.pow(2, i);
      }
    }
    System.out.println(ans);
  }
}