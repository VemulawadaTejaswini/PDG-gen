import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);

    int sum = 0;
    int count = 0;
    int num = 0;
    for (int i = 0; i < N; i++) {
      if (a[i] != num) {
        sum += count - num >= 0 ? count - num : count;
        num = a[i];
        count = 1;
      } else {
        count++;
      }
    }
    sum += count - num >= 0 ? count - num : count;
    System.out.println(sum);
  }
}