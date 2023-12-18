import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int M = scanner.nextInt();

    int[] a = new int[A];
    for (int i = 0; i < A; i++) {
      a[i] = scanner.nextInt();
    }

    int[] b = new int[B];
    for (int i = 0; i < B; i++) {
      b[i] = scanner.nextInt();
    }

    int mina = 300000;
    for (int i = 0; i < A; i++) {
      if (mina > a[i]) mina = a[i];
    }

    int minb = 300000;
    for (int i = 0; i < B; i++) {
      if (minb > b[i]) minb = b[i];
    }

    int waribiki = 300000;
    for (int i = 0; i < M; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int c = scanner.nextInt();
      x--;
      y--;
      
      int cost = a[x] + b[y] - c;
      if (waribiki > cost) waribiki = cost;
    }

    scanner.close();

    if (mina + minb < waribiki) {
      System.out.println(mina + minb);
    } else {
      System.out.println(waribiki);
    }
  }
}