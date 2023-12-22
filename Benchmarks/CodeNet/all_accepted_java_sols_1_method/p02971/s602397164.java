import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int max = 0;
    int maxCount = 0;
    int max2nd = 0;
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      if (A[i] > max) {
        // update max
        max2nd = max;
        max = A[i];
        maxCount = 1;
      } else if (A[i] == max) {
        maxCount++;
      } else if (A[i] > max2nd) {
        max2nd = A[i];
      }
    }
    
    for (int i = 0; i < N; i++) {
      if (A[i] == max) {
        if (maxCount >= 2) {
          System.out.println(max);
        } else {
          System.out.println(max2nd);
        }
      } else {
        System.out.println(max);
      }
    }
  }
}