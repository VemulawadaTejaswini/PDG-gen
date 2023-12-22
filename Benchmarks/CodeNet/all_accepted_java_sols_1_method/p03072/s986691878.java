import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = sc.nextInt();
    int cnt = 1;
    for (int i = 0; i < N - 1; i++) {
      int A = sc.nextInt();
      if (max <= A) {
        max = A;
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
