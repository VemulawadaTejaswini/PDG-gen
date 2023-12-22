import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int target = sc.nextInt();
    int divisors = 0;

    for (int i = start; i <= end; i++) {
      if (target % i == 0) {
        divisors++;
      }
    }
    System.out.println(divisors);
  }
}