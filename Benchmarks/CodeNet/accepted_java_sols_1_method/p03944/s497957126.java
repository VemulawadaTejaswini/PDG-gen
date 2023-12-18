import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }
    int[][] rect = new int[w][h];
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        rect[i][j] = 0;
      }
    }
    for (int i = 0; i < n; i++) {
      int start_x = 0;
      int end_x = w;
      int start_y = 0;
      int end_y = h;
      if (a[i] == 1) {
        end_x = x[i];
      } else if (a[i] == 2) {
        start_x = x[i];
      } else if (a[i] == 3) {
        end_y = y[i];
      } else if (a[i] == 4) {
        start_y = y[i];
      }
      for (int j = start_x; j < end_x; j++) {
        for (int k = start_y; k < end_y; k++) {
          rect[j][k]++;
        }
      }
    }
    int result = 0;
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        if (rect[i][j] == 0) {
          result++;
        }
      }
    }
    System.out.println(result);
  }
}