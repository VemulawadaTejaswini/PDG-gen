import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();

    long[] minutes = new long[n + m];
    for (int i = 0; i < n + m; i++) {
      minutes[i] = sc.nextLong();
    }

    Arrays.sort(minutes);

    long ret = 0;
    long currentMinutes = 0;
    for (long minute : minutes) {
      currentMinutes += minute;
      if (currentMinutes <= k) {
        ret++;
      } else {
        break;
      }
    }
    System.out.println(ret);
  }
}
