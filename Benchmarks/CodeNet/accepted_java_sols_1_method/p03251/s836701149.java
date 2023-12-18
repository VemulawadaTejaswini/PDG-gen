import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    int[] x = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }
    Arrays.sort(x);
    int[] y = new int[M];
    for (int i = 0; i < M; i++) {
      y[i] = sc.nextInt();
    }
    Arrays.sort(y);

    final String ans;
    if (x[N-1] < y[0] && X < y[0] && x[N-1] < Y) {
      ans = "No War";
    } else {
      ans = "War";
    }

    System.out.println(ans);
  }
}