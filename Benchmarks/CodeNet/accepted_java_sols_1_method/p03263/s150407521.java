import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();
    int[][] a = new int[H][W];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    int h = 0;
    int w = 0;
    int true_j = 0;
    int flag = 1;
    int back = 1;
    int[][] ans = new int[H * W][4];
    int count = 0;

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (back == 1) {
          true_j = j;
        } else {
          true_j = W-1-j;
        }

        int current = a[i][true_j];

        if (flag == 1) {
          if (current % 2 == 1) {
            flag *= -1;
          }
        } else {
          if (current % 2 == 1) {
            flag *= -1;
          }

          ans[count][0] = h+1;
          ans[count][1] = w+1;
          ans[count][2] = i+1;
          ans[count][3] = true_j+1;
          count++;
        }

        h = i;
        w = true_j;
      }

      back *= -1;
    }

    System.out.println(count);
    for (int i = 0; i < count; i++) {
      System.out.println(ans[i][0]+" "+ans[i][1]+" "+ans[i][2]+" "+ans[i][3]);
    }
  }
}
