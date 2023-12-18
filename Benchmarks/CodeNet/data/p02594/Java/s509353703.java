import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    long k = (long) sc.nextInt();
    long tmpk = k;
    long cnt = 1;

    if (k % 2 != 0) {
      while (tmpk < ((long) 10 * (long) 10 * (long) 10 * (long) 10 * (long) 10 * (long) 10 * (long) 10)) {
        if (tmpk % 10 == 7) {
          tmpk = tmpk / 10;
          ans++;
          if (tmpk == 0) {
            break;
          }
          continue;
        }
        cnt++;
        tmpk = k * cnt;
        ans = 0;
      }
    } else {
      ans = -1;
    }
    System.out.println(ans + "");
    sc.close();
  }

}