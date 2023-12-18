import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[100001];
    long s = 0;
    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      a[tmp]++;
      s += tmp;
    }

    int q = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < q; i++) {
      int b = sc.nextInt();
      int c = sc.nextInt();

      a[c] += a[b];
      s += (c - b) * a[b];
      a[b] = 0;

      sb.append(s + "\r\n");
    }

    System.out.print(sb);
  }
}
