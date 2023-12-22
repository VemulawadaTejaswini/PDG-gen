import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    long[][] chose = new long[n+1][w+1];
    int[] weight = new int[n];
    int[] value = new int[n];
    for(int i = 0; i <= n; i++) {
      for(int j = 0; j <= w; j++) {
        chose[i][j] = 0;
      }
    }
    for(int i = 0; i < n; i++) {
      weight[i] = Integer.parseInt(sc.next());
      value[i] = Integer.parseInt(sc.next());
    }
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= w; j++) {
        chose[i+1][j] = chose[i][j];
        if(j >= weight[i]) {
          chose[i+1][j] = Math.max(chose[i+1][j], chose[i][j-weight[i]] + value[i]);
        }
      }
    }
    System.out.println(chose[n][w]);
  }
}
