import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N - 1];
    int[] b = new int[N - 1];
    for (int i = 0; i < N - 1; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    sc.close();

    @SuppressWarnings("unchecked")
    List<int[]>[] g = new List[N + 1];
    g[0] = Collections.emptyList();
    for (int i = 0; i < N - 1; i++) {
      if (g[a[i]] == null) g[a[i]] = new ArrayList<>();
      if (g[b[i]] == null) g[b[i]] = new ArrayList<>();
      g[a[i]].add(new int[] {b[i], i});
      g[b[i]].add(new int[] {a[i], i});
    }
    int K = 0;
    for (List<int[]> e : g) K = Integer.max(K, e.size());

    int[] c = new int[N - 1];
    Deque<int[]> q = new ArrayDeque<>();
    q.addLast(new int[] {1, -1});
    while (!q.isEmpty()) {
      int[] n = q.pollFirst();
      int cno = n[0];
      int pid = n[1];

      int ec = 1;
      List<int[]> es = g[cno];
      for (int[] e : es) {
        int dno = e[0];
        int did = e[1];
        if (did == pid) continue;

        if (-1 < pid && ec == c[pid]) ec++;
        c[did] = ec++;
        q.addLast(new int[] {dno, did});
      }
    }
    StringBuffer buf = new StringBuffer();
    for (int i : c) buf.append(i).append(System.lineSeparator());

    System.out.println(K);
    System.out.println(buf);
  }
}