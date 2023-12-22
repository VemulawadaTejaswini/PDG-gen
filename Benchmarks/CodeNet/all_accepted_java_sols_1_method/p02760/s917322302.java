import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[3][3];
    String res = "";

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int N = sc.nextInt();

    for (int k = 0; k < N; k++) {
      int b = sc.nextInt();

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (b == A[i][j]) {
            A[i][j] = 0;
          }
        }
      }
    }
    if (A[0][0] == A[1][1] && A[1][1] == A[2][2] || A[0][2] == A[1][1] && A[1][1] == A[2][0] || A[0][0] == A[0][1] && A[0][1] == A[0][2] || A[1][0] == A[1][1] && A[1][1] == A[1][2] || A[2][0] == A[2][1] && A[2][1] == A[2][2] || A[0][0] == A[1][0] && A[1][0] == A[2][0] || A[0][1] == A[1][1] && A[1][1] == A[2][1] || A[0][2] == A[1][2] && A[1][2] == A[2][2]) {
      res = "Yes";
    } else {
      res = "No";
    }
    System.out.println(res);
  }
}