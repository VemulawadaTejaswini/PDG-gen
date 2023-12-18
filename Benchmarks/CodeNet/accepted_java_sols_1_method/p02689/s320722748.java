import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long m = sc.nextLong();
    long[] listH = new long[n];

    for (int i = 0; i < n; i++) {
      listH[i] = sc.nextLong();
    }

    int[] listBad = new int[n];
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;

      if (listH[a] <= listH[b]) {
        listBad[a]++;
      }

      if (listH[b] <= listH[a]) {
        listBad[b]++;
      }
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
      if (listBad[i] == 0) {
        count++;
      }
    }
    System.out.println(count);

    sc.close();

  }
}