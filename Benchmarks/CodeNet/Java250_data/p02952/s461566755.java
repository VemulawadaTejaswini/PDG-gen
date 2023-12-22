import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();

    int ans = 0;
    if (N < 10) {
      ans = N;
    } else if (N < 100) {
      ans = 9;
    } else if (N < 1000) {
      ans = 9;
      ans += N - 99;
    } else if (N < 10000) {
      ans = 909;
    } else if (N < 100000) {
      ans = 909;
      ans += N - 9999;
    } else if (N < 1000000) {
      ans = 90909;
    }

    System.out.println(ans);
  }
}