import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 1;
    long max = 1000000000000000000L;
    boolean isMax = false;

    for (int i = 0; i < n; i++) {
      long a = sc.nextLong();
      if (a== 0) {
        sum = 0;
        break;
      }
      if (!isMax) {
        sum *= a;
      }
      if (sum > max || sum == 0) {
        sum = -1;
        isMax = true;
      }
    }
    System.out.println(sum);
  }
}