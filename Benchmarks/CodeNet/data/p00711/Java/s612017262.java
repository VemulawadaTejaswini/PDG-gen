import java.util.*;
    
public class Main {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String...args) {
    while(sc.hasNext()) {
      final int W = sc.nextInt();
      final int H = sc.nextInt();
      if (W == 0 && H == 0)
        break;
      solve(W, H);
    }
  }
  private static void solve(final int W, final int H) {
    final char[][] map = new char[H][];
    for(int i = 0; i < H; i+;)
      map[i] = sc.next().toCharArray();
    final Deque<Integer> deq = new ArrayDeque<Integer>();
    for(int i = 0; i < H; i++)
      for(int j = 0; j < W; j++)
        if(map[i][j] == '@')
          deq.offer(i * W + j);
    int ans = 0;
    while(!deq.isEmpty()) {
      final int p = deq.poll();
      final int i = p / W;
      final int j = p % W;
      for(int d = 0; d < 4; d++) {
        final int ni = i + di[d];
        final int nj = j + dj[d];
        if(0 <= ni && ni < H && 0 <= nj && nj < W && map[ni][nj] == '.') {
          map[ni][nj] = '#';
          deq.offer(ni * W + nj);
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
  private static final int[] di = { 1, 0, -1, 0};
  private static final int[] dj = { 0, 1, 0, -1 };
}