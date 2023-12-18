import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int N = sc.nextInt();
    while (N-- > 0) {
      int n = sc.nextInt();
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (A[i][j] == n) {
            A[i][j] = 0;
            break;
          }
        }
      }
    }
    for (int i = 0; i < 3; i++) {
        if (A[i][0] == A[i][1] && A[i][1] == A[i][2] && A[i][2] == 0) {
          System.out.println("Yes");
          return;
        }
    }
    for (int i = 0; i < 3; i++) {
      if (A[0][i] == A[1][i] && A[1][i] == A[2][i] && A[2][i] == 0) {
        System.out.println("Yes");
        return;
      }
    }
    if (A[0][0] == A[1][1] && A[1][1] == A[2][2] && A[2][2] == 0) {
      System.out.println("Yes");
      return;
    }
    if (A[0][2] == A[1][1] && A[1][1] == A[2][0] && A[2][0] == 0) {
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}
