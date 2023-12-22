import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int n = s.length;
    int[] a = new int[n + 1];
    for (int i = 0; i < n; i++) a[n - i] = s[i] - '0';


    long sum = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        long b = 1;
        for (int k = 0; k < j - 1; k++) b *= 10;
        b *= a[i];
        b *= 1 << (n - i);
        if (i - j - 1 > 0) b *= 1 << (i - j - 1);
        sum += b;
      }
    }
    System.out.println(sum);
  }
}
