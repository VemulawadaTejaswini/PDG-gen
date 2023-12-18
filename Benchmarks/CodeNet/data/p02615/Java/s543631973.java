import java.util.*;
import java.util.stream.*;

class Main {
  static String[][] field;
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long min = (long)Math.pow(10,9);
    long total = 0;
    for (int i = 0; i < N; i++) {
      long n = sc.nextLong();
      total += n;
      min = Math.min(min, n);
    }
    System.out.println(total - min);
  }
}