import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 30000;
    char[] s = sc.next().toCharArray();
    int sl = s.length;
    char[] t = sc.next().toCharArray();
    int tl = t.length;

    for (int cnt = 0; cnt < (sl - tl + 1); cnt++) {
      int tmp = 0;
      for (int j = 0; j < tl; j++) {
        if (s[cnt + j] != t[j]) {
          tmp++;
        }
      }
      ans = Math.min(ans, tmp);
    }

    System.out.println(ans);
    sc.close();
  }
}