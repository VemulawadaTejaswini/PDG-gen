import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    long ppp[] = new long[N];
    long ppm[] = new long[N];
    long pmp[] = new long[N];
    long pmm[] = new long[N];
    long mpp[] = new long[N];
    long mpm[] = new long[N];
    long mmp[] = new long[N];
    long mmm[] = new long[N];

    for (int i = 0; i < N; i++) {
      long x = Long.parseLong(sc.next());
      long y = Long.parseLong(sc.next());
      long z = Long.parseLong(sc.next());
      ppp[i] = x + y + z;
      ppm[i] = x + y - z;
      pmp[i] = x - y + z;
      pmm[i] = x - y - z;
      mpp[i] = -x + y + z;
      mpm[i] = -x + y - z;
      mmp[i] = -x - y + z;
      mmm[i] = -x - y - z;
    }
    Arrays.sort(ppp);
    Arrays.sort(ppm);
    Arrays.sort(pmp);
    Arrays.sort(pmm);
    Arrays.sort(mpp);
    Arrays.sort(mpm);
    Arrays.sort(mmp);
    Arrays.sort(mmm);

    long ans = 0, sum;
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += ppp[i];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += ppm[i];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += pmp[i];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += pmm[i];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += mpp[i];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += mpm[i];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += mmp[i];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int i = N - 1; i > N - 1 - M; i--) {
      sum += mmm[i];
    }
    ans = Math.max(ans, sum);

    System.out.println(ans);
  }
}