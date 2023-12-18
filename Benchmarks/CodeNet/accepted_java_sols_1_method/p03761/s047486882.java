
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] ss = new int[n][26];
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      for(int j = 0; j < s.length(); j++) {
        ss[i][s.charAt(j) - 'a']++;
      }
    }
    int[] anss = new int[26];
    for(int i = 0; i < 26; i++) {
      anss[i] = 100;
    }
    for(int i = 0; i < 26; i++) {
      for(int j = 0; j < n; j++) {
        anss[i] = Math.min(anss[i], ss[j][i]);
      }
    }
    String ans = "";
    for(int i = 0; i < 26; i++) {
      String str = "";
      char cc = (char)('a' + i);
      String c = String.valueOf(cc);
      for(int j = 0; j < anss[i]; j++) {
        str += c;
      }
      ans += str;
    }
    System.out.println(ans);
  }
}
