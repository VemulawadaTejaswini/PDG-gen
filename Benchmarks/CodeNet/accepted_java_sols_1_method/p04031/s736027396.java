import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    scanner.nextLine();
    final int[] n = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    final int x = Arrays.stream(n).sum() / n.length;

    int cost0 = 0;
    int cost1 = 0;
    for (int i = 0; i < n.length; i++) {
      cost0 += (n[i] - x) * (n[i] - x);
      cost1 += (n[i] - (x + 1)) * (n[i] - (x + 1));
    }

    System.out.println(Math.min(cost0, cost1));
  }
}