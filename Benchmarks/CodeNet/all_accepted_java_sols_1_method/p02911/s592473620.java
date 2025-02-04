import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] A = new int[Q];
    int[] correct = new int[N];

    for (int i = 0; i < Q; i++) {
      A[i] = sc.nextInt() - 1;
      correct[A[i]]++;
    }

    sc.close();
    
    for (int i = 0; i < N; i++) {
      if (0 < correct[i] + K - Q) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

  }

}