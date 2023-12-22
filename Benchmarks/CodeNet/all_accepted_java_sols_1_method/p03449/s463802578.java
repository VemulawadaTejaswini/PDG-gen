import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[][] A = new int[2][N];

    for (int i = 0; i < 2; i++){
      for (int j = 0; j < N; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    sc.close();

    int count = 0;
    int count_ = 0;

    // 右に A 回移動する
    // 下に 1 回移動する
    // 右に N - A 回移動する

    for (int i = 0; i < N; i++) {
      for (int j = 0; j <= i; j++) {
        count_ += A[0][j];
      }
      for (int j = i; j < N; j++) {
        count_ += A[1][j];
      }
      count = Math.max(count, count_);
      count_ = 0;
    }

    System.out.println(count);

  }

}