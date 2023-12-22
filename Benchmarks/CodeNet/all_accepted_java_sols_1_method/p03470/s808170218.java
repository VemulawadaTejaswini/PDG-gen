import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] d = new int[n];
    for (int i = 0; i < n; i++) {
      d[i] = scanner.nextInt();
    }
    Arrays.sort(d);
    int num = 1;
    for (int i = 0; i < n - 1; i++) {
      if (d[i] < d[i + 1]) num++;
    }
    System.out.println(num);
  }
}
