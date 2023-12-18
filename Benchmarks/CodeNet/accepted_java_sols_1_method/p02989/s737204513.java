import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
    for (int i = 0; i < N; i++) {
      d[i] = sc.nextInt();
    }
    Arrays.sort(d);
    int half = N / 2;
    System.out.println(d[half] - d[half - 1]);
  }
}
