import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner s = new Scanner(System.in);
    final int N = Integer.parseInt(s.next());
    final int M = Integer.parseInt(s.next());
    final int[] array = new int[N];
    Arrays.fill(array, 1);
    final boolean[] flg = new boolean[N];
    flg[0] = true;

    for (int i = 0; i < M; i++) {
      final int x = Integer.parseInt(s.next()) - 1;
      final int y = Integer.parseInt(s.next()) - 1;
      array[x]--;
      array[y]++;
      if (flg[x]) {
        if (array[x] <= 0) flg[x] = false;
        flg[y] = true;
      }
    }
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (flg[i]) count++;
    }
    System.out.println(count);
  }
}