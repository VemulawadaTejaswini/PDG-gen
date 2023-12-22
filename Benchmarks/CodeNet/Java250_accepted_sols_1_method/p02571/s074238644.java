import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    char[] sChar = s.toCharArray();
    char[] tChar = t.toCharArray();
    int ans = t.length();
    int searchN = s.length() - (t.length() - 1);
    for (int cnt = 0; cnt < searchN; cnt++) {
      int diffC = 0;
      for (int cnt2 = 0; cnt2 < t.length(); cnt2++) {
        if (sChar[cnt2 + cnt] != tChar[cnt2]) {
          diffC++;
        }
      }
      ans = Math.min(diffC, ans);
    }
    System.out.println(ans);
    sc.close();
  }
}