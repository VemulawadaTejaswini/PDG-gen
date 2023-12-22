import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    for (int i = A; i <= B; i++) {
      if (A + C > i || B - C < i) {
        System.out.println(i);
      }
    }
  }
}
