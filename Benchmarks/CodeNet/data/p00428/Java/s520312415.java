import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
  static public void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int[][] list = new int[m][2];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        list[j][0] = j + 1;
        list[j][1] += s.nextInt();
      }
    }
    Arrays.sort(list, new Comparator() {
      public int compare(Object o1, Object o2) {
        return ((int[])o2)[1] - ((int[])o1)[1];
      }
    });
    for (int i = 0; i < m - 1; i++) {
      System.out.printf("%d ", list[i][0]);
    }
    System.out.printf("%d\n", list[m - 1][0]);
  }
}