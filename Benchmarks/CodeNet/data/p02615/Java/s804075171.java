import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

class Main {
  static String[][] field;
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    long[] A = Arrays.stream(sc.nextLine().split(" "))
      .mapToLong(Long::parseLong)
      .sorted()
      .toArray();
    long total = 0;
    for (int i = 1; i <= N-1; i++) {
       total += A[N-1-(i/2)];
    }
    System.out.println(total);
  }
}