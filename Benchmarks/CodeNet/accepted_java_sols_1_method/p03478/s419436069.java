import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum = 0;
    int total = 0;
    int tmp = 0;
    for (int i = 1; i <= N; i++) {
      sum = 0;
      tmp = i;
      while (tmp != 0) {
        sum += tmp % 10;
        tmp /= 10;
      }
      if (sum >= A && sum <= B) {
        total += i;
      }
    }
    System.out.println(total);
  }
}
