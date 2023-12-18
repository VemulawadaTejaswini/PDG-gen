import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int cnt = 0;
    int total = A + B + C;
    int max = Math.max(A, B);
    max = Math.max(max, C);
    int possibleA = max * 3;
    int possibleB = (max + 1) * 3;
    while (true) {
      if (total == possibleA) {
        System.out.println(cnt);
        break;
      }
      if (total == possibleB) {
        System.out.println(cnt);
        break;
      }
      total += 2;
      cnt++;
    }
  }
}
