import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int n = scanner.nextInt();
    final int k = scanner.nextInt();
    scanner.nextLine();
    final int[] p = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
    Arrays.sort(p);

    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += p[i];
    }

    System.out.println(sum);
  }
}
