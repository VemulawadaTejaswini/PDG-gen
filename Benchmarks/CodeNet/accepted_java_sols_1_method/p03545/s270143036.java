import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int[] a = new int[4];
    for (int i = 0; i < 4; i++) a[i] = s[i] - '0';
    char[] c = new char[4];
    for (int i = -1; i < 2; i += 2) {
      c[0] = i == -1 ? '-' : '+';
      for (int j = -1; j < 2; j += 2) {
        c[1] = j == -1 ? '-' : '+';
        for (int k = -1; k < 2; k += 2) {
          c[2] = k == -1 ? '-' : '+';
          if (a[0] + i * a[1] + j * a[2] + k * a[3] == 7) {
            System.out.printf("%d%s%d%s%d%s%d=7\n",a[0],c[0],a[1],c[1],a[2],c[2],a[3]);
            return;
          }
        }
      }
    }
  }
}
