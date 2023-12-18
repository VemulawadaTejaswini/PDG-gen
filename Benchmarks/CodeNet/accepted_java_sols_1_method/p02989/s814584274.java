import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    for (int i = 0; i < n; i++) {
      d[i] = sc.nextInt();
    }
    sc.close();

    if (n % 2 == 1) {
      System.out.println(0);
    } else {
      Arrays.sort(d);
      int min = d[d.length / 2 - 1];
      int max = d[d.length / 2];
      System.out.println(max - min);
    }
  }
}
