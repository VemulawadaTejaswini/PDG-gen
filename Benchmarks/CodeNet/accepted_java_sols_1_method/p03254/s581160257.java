import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);

    int cnt = 0, sum = 0;
    while (cnt < N && sum < x) {
        sum += a[cnt];
        cnt++;
    }
    // 子供 iはちょうど ai個のお菓子を貰うと喜びます。
    System.out.println(sum == x ? cnt : cnt - 1);
  }
}
