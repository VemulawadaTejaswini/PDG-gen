import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N];
    int max1 = 0;
    int max1Ind = -1;
    int max2 = 0;
    int max2Ind = -1;
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      if (A[i] > max1) {
        max1 = A[i];
        max1Ind = i;
      } else if (A[i] > max2) {
        max2 = A[i];
        max2Ind = i;
      }
    }

    for (int i = 0; i < N; i++) {
      if (i == max1Ind) {
        System.out.println(max2);
      } else {
        System.out.println(max1);
      }
    }

  }
}