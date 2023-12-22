import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();
    
    int[] nums = new int[N];
    
    for (int i = 0; i < N; i++) {
      nums[i] = in.nextInt();
    }
    
    int[] heights = new int[N];
    for (int i = 0; i < M; i++) {
      int A = in.nextInt() - 1;
      int B = in.nextInt() - 1;

      heights[A] = Math.max(heights[A], nums[B]);
      heights[B] = Math.max(heights[B], nums[A]);
    }

    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (nums[i] > heights[i]) ans++;
    }
    
    System.out.println(ans);
  }
}
