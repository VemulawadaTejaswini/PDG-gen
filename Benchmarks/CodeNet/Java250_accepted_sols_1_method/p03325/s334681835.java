import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] a = new int[10000 + 1];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }
    in.close();

    int cnt = 0;
    for (int i = 0; i < N; i++) {
      int t = a[i];
      while (t % 2 == 0) {
        t /= 2;
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
