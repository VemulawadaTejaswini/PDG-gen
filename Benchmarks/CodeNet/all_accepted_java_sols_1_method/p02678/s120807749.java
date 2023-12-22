import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    sc.close();

    @SuppressWarnings("unchecked")
    List<Integer>[] tree = new List[N + 1];
    for (int i = 0; i < M; i++) {
      if (tree[A[i]] == null) tree[A[i]] = new ArrayList<>();
      if (tree[B[i]] == null) tree[B[i]] = new ArrayList<>();
      tree[A[i]].add(B[i]);
      tree[B[i]].add(A[i]);
    }

    int cnt = 0;
    int[] ans = new int[N + 1];

    Deque<Integer> q = new ArrayDeque<>();
    q.addLast(1);
    while (!q.isEmpty()) {
      int n = q.pollFirst();

      List<Integer> es = tree[n];
      for (int e : es) {
        if (ans[e] != 0) continue;
        if (e == ans[n]) continue;
        cnt++;
        ans[e] = n;
        q.addLast(e);
      }
    }

    if (cnt == N - 1)
      System.out.println("Yes");
    else
      System.out.println("No");

    for (int i = 2; i < N + 1; i++)
      System.out.println(ans[i]);
  }
}
