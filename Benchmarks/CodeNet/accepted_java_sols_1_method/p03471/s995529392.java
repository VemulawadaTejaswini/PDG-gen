import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y1 = sc.nextInt();
    y1 /= 1000;
    int r = (y1 % 5);
    int[] ans = new int[3];
    ans[0] = -1;
    ans[1] = -1;
    ans[2] = -1;
    int flg = 0;
    for(int z = r; z <= n; z += 5) {
      int s = (y1 - z) / 5;
      int r2 = (s % 2);
      for(int y = r2; y <= (n - z); y += 2) {
        int x = (s - y) / 2;
        if((x + y + z) == n) {
          flg++;
          ans[0] = x;
          ans[1] = y;
          ans[2] = z;
          break;
        }
      }
      if(flg > 0) break;
    }
    System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
  }
}
