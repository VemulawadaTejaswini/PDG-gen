import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] px = new int[90001];
    int[] py = new int[90001];
    int H = sc.nextInt();
    int W = sc.nextInt();
    int D = sc.nextInt();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int A = sc.nextInt();
          px[A] = i;
          py[A] = j;
      }
    }
    int[] d = new int[90001];
    for (int i=D+1; i<=H*W; i++) {
      d[i] = d[i-D] + Math.abs(px[i]-px[i-D]) + Math.abs(py[i]-py[i-D]);
    }
    int Q = sc.nextInt();
    for (int i = 0; i < Q; i++) {
      int L = sc.nextInt();
      int R = sc.nextInt();
      System.out.println(d[R]-d[L]);
    }
  }
}
