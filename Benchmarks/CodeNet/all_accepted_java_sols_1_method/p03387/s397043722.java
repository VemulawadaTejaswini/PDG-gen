import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] n = new int[3];
    for (int i = 0; i < 3; i++) n[i] = scanner.nextInt();
    Arrays.sort(n);

    int r = n[2] - n[0] + n[2] - n[1];
    if (r % 2 == 0) {
      System.out.println(r / 2);
    } else {
      System.out.println((r + 3) / 2);
    }
  }
}
