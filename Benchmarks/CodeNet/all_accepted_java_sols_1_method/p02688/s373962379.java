import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    int check =0;
    for (int i =0; i<K; i++) {
      int d = sc.nextInt();
      for (int j =0; j<d; j++) {
        A[sc.nextInt() - 1]++;
      }
    }
    for (int i =0; i<N; i++) {
      if (A[i] == 0) {
        check++;
      }
    }
    System.out.println(check);
  }
}