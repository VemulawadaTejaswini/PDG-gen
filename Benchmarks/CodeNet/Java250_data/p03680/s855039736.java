import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      a[i] = sc.nextInt();
    }
    int light = 1;
    int[] used = new int[N + 1];
    int count = 0;
    while (true) {
      if (used[light] > 0) {
        System.out.println(-1);
        return;
      }
      if (light == 2) {
        System.out.println(count);
        return;
      }
      used[light] = 1;
      light = a[light];
      count++;
    }
  }
}