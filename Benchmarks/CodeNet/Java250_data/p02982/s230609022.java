import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int[][] X = new int[N+1][D+1];
    int[][] p = new int[N+1][N+1];
    int count =0;
    for (int i =1; i<=N; i++) {
      for (int j =1; j<=D; j++) {
        X[i][j] = sc.nextInt();
      }
    }
    for (int i=1; i<=N; i++) {
      for (int j=i+1; j<=N; j++) {
        for (int k=1; k<=D; k++) {
          p[i][j] += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
        }
        for (int l=1; l<=150; l++) {
          if(p[i][j] == l * l) {
            count++;
            break;
          }
        }
      }
    }
    System.out.println(count);
  }
}