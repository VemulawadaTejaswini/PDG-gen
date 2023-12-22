import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] p = new int[n + 2];

    int outOfOrder = 0;

    for (int i = 0; i < n; ++i) {
      p[i] = sc.nextInt();
      if (outOfOrder == 0 && p[i] != i + 1)
        outOfOrder = 1;
      else if (outOfOrder == 1 && p[i] != i + 1) {
        if (p[p[i] - 1] == i + 1)
          outOfOrder = 2;
        else
          outOfOrder = -1;
      } else if (p[i] != i + 1)
        outOfOrder = -1;
    }

    if (outOfOrder == -1)
      System.out.println("NO");
    else
      System.out.println("YES");

  }
}