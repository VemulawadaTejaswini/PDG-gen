import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    Map<Integer, Set<Integer>> graph = new HashMap<Integer, Set<Integer>>();
    for (int i = 0; i < n; i++) {
      graph.put(i, new HashSet<Integer>());
    }

    //辺の情報を格納する
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph.get(a - 1).add(b - 1);
      graph.get(b - 1).add(a - 1);
    }

    Queue<Integer> q = new ArrayDeque<Integer>();
    int[] arr = new int[n];
    Arrays.fill(arr, -1);
    arr[0] = 0;
    q.add(0);
    while (!q.isEmpty()) {
      int pos = q.remove();
      for (int tmp : graph.get(pos)) {
        if (arr[tmp] != -1) {
          continue;
        }
        q.add(tmp);
        arr[tmp] = pos;
      }
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] == -1) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
    for (int i = 1; i < n; i++) {
      System.out.println(arr[i] + 1);
    }
  }
}
