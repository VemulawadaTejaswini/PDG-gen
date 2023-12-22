import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    
    double minDiff = Integer.MAX_VALUE;
    int minIdx = 0;
    for (int i = 1; i <= N; i++) {
      int h = sc.nextInt();
      double t = T - 0.006 * h;
      double diff = Math.abs(A - t);
      if (diff < minDiff) {
        minDiff = diff;
        minIdx = i;
      }
    }
    
    System.out.println(minIdx);
  }
}