import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int[] B = Arrays.stream(A).sorted().toArray();
    int max = B[N-1];
    int nextMax = B[N-2];
    for (int i = 0; i < N; i++) {
      if (A[i] == max) {
        System.out.println(nextMax);
      } else {
        System.out.println(max);
      }
    }
  }
}