import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    int curH = -1;
    int curMax = 0;
    while (N-- > 0) {
      int nextH = sc.nextInt();
      if (curH >= nextH) {
        ans++;
      } else {
        curMax = Math.max(curMax, ans);
        ans = 0;
      }
      curH = nextH;
    }
    curMax = Math.max(curMax, ans);
    System.out.println(curMax);
  }
}
