import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    final int INIT_NUM = -1;

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    x--; y--;

    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
      int[] dest = new int[n]; //k+1のノードの基準との最短距離（kは配列のインデックス）
      Arrays.fill(dest, INIT_NUM);
      Deque<Integer> queue = new ArrayDeque<>();

      queue.add(i);
      dest[i] = 0;
      while (!queue.isEmpty()) {
        int pos = queue.poll();

        if (pos < n - 1 && dest[pos + 1] == INIT_NUM) {
          queue.add(pos + 1);
          dest[pos + 1] = dest[pos] + 1;
        }

        if (pos > 0 && dest[pos - 1] == INIT_NUM) {
          queue.add(pos - 1);
          dest[pos - 1] = dest[pos] + 1;
        }

        if (pos == x && dest[y] == INIT_NUM) {
          queue.add(y);
          dest[y] = dest[pos] + 1;
        }
      }

      for (int j = i; j < n; j++) {
        result[dest[j]]++;
      }
    }

    for (int i = 1; i < n; i++) {
      System.out.println(result[i]);
    }

  }
}
