import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[3];
    for (int i = 0; i < a.length; i++) {
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);
    int cost = 0;
    for (int i = 1; i < a.length; i++) {
      cost += a[i] - a[i - 1];
    }
    System.out.println(cost);
  }
}
