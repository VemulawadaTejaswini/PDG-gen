import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int D = sc.nextInt();
    int[][] A = new int[H*W][2];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int a = sc.nextInt();
        A[a-1][0] = i;
        A[a-1][1] = j;
      }
    }
    
    int[] cost = new int[H*W];
    for (int i = D; i < H*W; i++) {
      cost[i] += cost[i-D]+Math.abs(A[i][0]-A[i-D][0])+Math.abs(A[i][1]-A[i-D][1]);
    }
    
    StringBuilder ans = new StringBuilder();
    int Q = sc.nextInt();
    while (Q-- > 0) {
      int L = sc.nextInt();
      int R = sc.nextInt();
      ans.append(cost[R-1]-cost[L-1]).append('\n');
    }
    
    System.out.print(ans.toString());
  }
}