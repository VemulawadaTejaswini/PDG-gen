import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 10000;
    for (int i = 1; i < n; i++) {
      int a = i;
      int b = n - i;
      int sum1 = 0;
      int sum2 = 0;
      while(a > 0) {
        sum1 += a % 10;
        a /= 10;
      }
      while(b > 0) {
        sum2 += b % 10;
        b /= 10;
      }
      if (sum1 + sum2 < answer) {
        answer = sum1 + sum2;
      }
    }
    System.out.println(answer);
  }
}