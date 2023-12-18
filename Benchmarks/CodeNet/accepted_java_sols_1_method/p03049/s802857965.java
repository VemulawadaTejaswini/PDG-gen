import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int BA = 0;
    int XA = 0;
    int BX = 0;
    int ans = 0;
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      char first = s.charAt(0);
      char last = s.charAt(s.length()-1);
      if (first == 'B' && last == 'A') {
        BA++;
      } else if (last == 'A') {
        XA++;
      } else if (first == 'B') {
        BX++;
      }
      for (int j = 0; j < s.length()-1; j++) {
        if (s.charAt(j) == 'A' && s.charAt(j+1) == 'B') {
          ans++;
        }
      }
    }
    //System.err.println(""+ans+" BA " +BA+ " XA " + XA+" BX " +BX);

    if (BA > 0) {
      ans += BA-1;
      if (BX > 0) {
        ans++;
        BX--;
      }
      if (XA > 0) {
        ans++;
        XA--;
      }
    }
    ans += Math.min(XA, BX);
    System.out.println(ans);
  }
}