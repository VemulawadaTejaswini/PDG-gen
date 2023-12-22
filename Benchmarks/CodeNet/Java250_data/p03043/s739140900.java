import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int K = in.nextInt();
    double sum = 0;
    for (int i = 1; i <= N; i++) {
      if (K <= i) {
        sum++;
        continue;
      }
      int value = i, p = 1;
      while (value < (K + 1) / 2) {
        value *= 2;
        p++;
      }
      sum += Math.pow(0.5, p);
    }
    System.out.println(sum / N);
  }
}