import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int[][][] house = {
        { new int[10], new int[10], new int[10] },
        { new int[10], new int[10], new int[10] },
        { new int[10], new int[10], new int[10] },
        { new int[10], new int[10], new int[10] }
    };

    for (int i = 0; i < n; i++) {
      int b = stdin.nextInt();
      int f = stdin.nextInt();
      int r = stdin.nextInt();
      int v = stdin.nextInt();
      house[b - 1][f - 1][r - 1] += v;
    }

    for (int i = 0; i < 4; i++) {
      for (int[] arr : house[i]) {
        for (int j = 0; j < 10; j++) {
          System.out.printf(j < 9 ? " %d" : " %d%n", arr[j]);
        }
      }

      if (i < 3) {
        System.out.println("####################");
      }
    }
  }

}