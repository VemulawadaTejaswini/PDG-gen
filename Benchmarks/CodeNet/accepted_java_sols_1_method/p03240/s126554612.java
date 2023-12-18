import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] xyh = new int[n][3];// x,y,h
    for (int i = 0; i < n; i++) {
      xyh[i][0] = sc.nextInt();
      xyh[i][1] = sc.nextInt();
      xyh[i][2] = sc.nextInt();
    }
    int H = 0;
    for (int cx = 0; cx <= 100; cx++) {
      Outer: for (int cy = 0; cy <= 100; cy++) {
        for (int i = 0; i < n; i++) {
          if (xyh[i][2] > 0) {
            H = Math.abs(xyh[i][0] - cx) + Math.abs(xyh[i][1] - cy) + xyh[i][2];
            break;
          }
        }
        for (int i = 0; i < n; i++) {
          int j = H - Math.abs(xyh[i][0] - cx) - Math.abs(xyh[i][1] - cy);
          if (j > 0 && xyh[i][2] != j) {
            continue Outer;
          } else if (j <= 0 && xyh[i][2] != 0) {
            continue Outer;
          }
        }
        System.out.println(cx + " " + cy + " " + H);
      }
    }
  }
}
