import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long num = 0;
    if(2 * N > M) {
      num = M / 2;
    } else {
      num = N;
      M -= 2 * N;
      num += M / 4;
    }
    System.out.println(num);
  }
}