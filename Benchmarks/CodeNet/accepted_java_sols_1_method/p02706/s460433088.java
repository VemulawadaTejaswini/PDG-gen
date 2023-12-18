import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    for(int n = 0; n < M; n++) {
        A[n] = sc.nextInt();
        N = N - A[n];
    }

    if(N >= 0) {
      System.out.println(N);
    } else {
      System.out.println("-1");
    }
  }
}