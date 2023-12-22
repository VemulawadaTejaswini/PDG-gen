import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = num[0];
    int x = num[1];
    int[] l = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] d = new int[n + 1];
    d[0] = 0;
    for (int i = 0; i < n; i++) {
      d[i + 1] = d[i] + l[i];
    }
    int count = 0;
    for (int i = 0; i <= n; i++) {
      count += d[i] <= x ? 1: 0;
    }
    System.out.println(count);
  }
}