import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    int[][] road = new int[N][N];

    for (int i = 0; i < M; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      road[a[i]][b[i]]++;
    }

    sc.close();

    for (int i = 0; i < N; i++) {
      int count = 0;
      for (int j = 0; j < N; j++) {
        if (road[i][j] != 0) {
          count += road[i][j];
        }
        if (road[j][i] != 0 && j != i) {
          count += road[j][i];
        }
      }
      System.out.println(count);
    }

  }

}