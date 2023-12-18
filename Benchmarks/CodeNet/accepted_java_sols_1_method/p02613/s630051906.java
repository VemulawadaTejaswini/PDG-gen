// 今回でいえば、A問題の方が実装難しいです･･･。
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // 準備
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s;

      int[] ans = new int[4];

      for(int i=0; i<n; ++i) {
        s = sc.next();
        if("AC".equals(s))
          ans[0]++;
        if("WA".equals(s))
          ans[1]++;
        if("TLE".equals(s))
          ans[2]++;
        if("RE".equals(s))
          ans[3]++;
      }

      System.out.println("AC x " + ans[0]);
      System.out.println("WA x " + ans[1]);
      System.out.println("TLE x " + ans[2]);
      System.out.println("RE x " + ans[3]);
    }
}