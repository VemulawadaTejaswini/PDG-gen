import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    boolean[] A = new boolean[101];
    boolean[] B = new boolean[101];
    for (int i = a; i < b; i++) {
      A[i] = true;
    }
    for (int i = c; i < d; i++) {
      B[i] = true;
    }

    int cnt = 0;
    for (int i = 0; i < 101; i++) {
      if (A[i] && B[i]) {
        cnt++;
      }
    }

    System.out.println(cnt);

  }
}