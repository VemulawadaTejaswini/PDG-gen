import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt() * 2 + 1;
    int cnt = 0;
    while (A > 0) {
      cnt++;
      A -= B;
    }
    System.out.println(cnt);
  }
}
