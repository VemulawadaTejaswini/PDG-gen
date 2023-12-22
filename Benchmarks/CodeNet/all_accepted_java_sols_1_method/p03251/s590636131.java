import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int x_max = -99999;
    int y_min = 99999;
    for (int i = 0; i < n; i++) {
      int tmp_x = sc.nextInt();
      if (x_max < tmp_x) {
        x_max = tmp_x;
      }
    }
    for (int i = 0; i < m; i++) {
      int tmp_y = sc.nextInt();
      if (y_min > tmp_y) {
        y_min = tmp_y;
      }
    }
    for (int z = -100; z <= 100; z++) {
      if (x < z && z <= y && x_max < z && z <= y_min) {
        System.out.println("No War");
        return;
      }
    }
    System.out.println("War");
  }
}