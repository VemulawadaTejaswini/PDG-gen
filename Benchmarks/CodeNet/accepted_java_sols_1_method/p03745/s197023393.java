import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    int count = 1;
    boolean inc = false;
    boolean dec = false;
    for (int i = 1; i < N; i++) {
      if (A[i] > A[i - 1]) inc = true;
      if (A[i] < A[i - 1]) dec = true;
      if (inc && dec) {
        count++;
        inc = false;
        dec = false;
      }
    }
    System.out.println(count);
  }
}
