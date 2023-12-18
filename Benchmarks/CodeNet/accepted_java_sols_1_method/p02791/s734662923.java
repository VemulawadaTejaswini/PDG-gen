import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 1;
    int min = sc.nextInt();
    for (int i = 0; i < N - 1; i++) {
      int next = sc.nextInt();
      if (min > next) {
        cnt++;
      }
      min = Math.min(min, next);
    }
    System.out.println(cnt);
  }
}
