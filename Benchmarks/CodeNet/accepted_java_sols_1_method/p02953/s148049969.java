import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
 
    for (int i = 1; i < N; i++) {
      if (A[i - 1] < A[i]) {
        A[i]--;
      } 
      else {
        if (A[i - 1] != A[i]) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}