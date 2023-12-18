import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+1];
    int check =0;
    for (int i =1; i<= N; i++) {
      A[i] = sc.nextInt();
      if (A[i] % 2 == 0) {
        if (A[i] % 3 != 0 && A[i] % 5 != 0) {
          check++;
        }
      }
    }
    if (check != 0) {
      System.out.print("DENIED");
    } else {
      System.out.print("APPROVED");
    }
  }
}