import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] x = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }

    int ans = Integer.MAX_VALUE;

    // sacn minus range
    int i = K-1;
    if (x[0] < 0 && x[i] <= 0) {
      while (i < N && x[i] <= 0) {
        i++;
      }
      ans = Math.min(ans, Math.abs(x[i-K]));
    }
    
    // scan across zero range
    while (i < N && x[i-(K-1)] < 0) {
      int leftPos = Math.abs(x[i-(K-1)]);
      int rightPos = x[i];
      // turn left edge
      ans = Math.min(ans, 2*leftPos + rightPos);
      // turn right edge
      ans = Math.min(ans, leftPos + 2*rightPos);
      
      i++;
    }
    
    // scan plus range
    if (i < N && x[i-(K-1)] >= 0) {
      ans = Math.min(ans, x[i]);
    }
    
    System.out.println(ans);
  }
}