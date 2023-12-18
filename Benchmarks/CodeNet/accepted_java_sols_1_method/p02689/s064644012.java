import java.util.Scanner;

public class Main {
  public static void main(String[] args) { // 入力
    Scanner scanner = new Scanner(System.in);
    final int N = scanner.nextInt();
    final int M = scanner.nextInt();
    //        System.out.println(N);
    //        System.out.println(M);

    int height[] = new int[N];
    for (int i = 0; i < N; i++) {
      height[i] = scanner.nextInt();
      //            System.out.println(height[i]);
    }

    int road[][] = new int[M][2];
    for (int i = 0; i < M; i++) {
      //            System.out.println("i＝" + i);
      road[i][0] = scanner.nextInt();
      //            System.out.println(road[i][0]);
      road[i][1] = scanner.nextInt();
      //            System.out.println(road[i][1]);
    }
    
    int goodnum[] = new int[N];

    for (int i = 0; i < M; i++) {
      if (height[road[i][0] - 1] <= height[road[i][1] - 1]) {
        goodnum[road[i][0] - 1] = 9;
      }
      if (height[road[i][1] - 1] <= height[road[i][0] - 1]) {
        goodnum[road[i][1] - 1] = 9;
      }
    }

    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (goodnum[i] == 0) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
