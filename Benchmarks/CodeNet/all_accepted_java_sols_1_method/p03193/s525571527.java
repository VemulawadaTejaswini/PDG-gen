import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (H <= A[i] && W <= B[i]) {
        count++;
      }
    }
    System.out.println(count);
  }
}