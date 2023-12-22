import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  private static int N;
  private static int[] S;
  private static int Q;
  private static int[] C;

  private static int binarySearch(int v, int low, int high) {
    if (low <= high) {
      int mid = (low + high) / 2;
      if (v > S[mid]) {
        return binarySearch(v, mid + 1, high);
      } else if (v < S[mid]){
        return binarySearch(v, low, mid - 1);
      } else if (v == S[mid]) {
        return v;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    S = new int[N];
    for (int i = 0; i < N; i++) {
      S[i] = in.nextInt();
    }

    Q = in.nextInt();
    C = new int[N];
    for (int i = 0; i < Q; i++) {
      C[i] = in.nextInt();
    }

    int cnt = 0;
    for (int i = 0; i < Q; i++) {
      int ret = binarySearch(C[i], 0, N - 1);
      if (ret >= 0) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }
}