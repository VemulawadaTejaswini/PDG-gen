import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    scanner.nextLine();
    final int[] a = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
    Map<Integer, Long> counts = new HashMap<>();
    long sum = 0;
    for (int i = 0; i < a.length; i++) {
      counts.put(
          a[i],
          counts.getOrDefault(a[i], 0L) + 1
      );
      sum += a[i];
    }

    final int q = scanner.nextInt();
    scanner.nextLine();
    final int[][] bc = new int[q][2];

    for (int i = 0; i < q; i++) {
      bc[i][0] = scanner.nextInt();
      bc[i][1] = scanner.nextInt();
      scanner.nextLine();

      final long replaceCount = counts.getOrDefault(bc[i][0], 0L);
      counts.put(
          bc[i][1],
          counts.getOrDefault(bc[i][1], 0L) + replaceCount
      );
      counts.remove(bc[i][0]);

      sum += replaceCount * (bc[i][1] - bc[i][0]);

      System.out.println(sum);
    }
  }
}
