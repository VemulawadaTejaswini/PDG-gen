import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head1 = br.readLine().split(" ");
    String[] head2 = br.readLine().split(" ");
    String[] head3 = br.readLine().split(" ");
    int h = Integer.parseInt(head1[0]);
    int w = Integer.parseInt(head1[1]);

    int ch = Integer.parseInt(head2[0]) - 1;
    int cw = Integer.parseInt(head2[1]) - 1;

    int dh = Integer.parseInt(head3[0]) - 1;
    int dw = Integer.parseInt(head3[1]) - 1;

    String[] map = new String[h];
    int[][] warp_count = new int[h][w];
    for (int i = 0; i < h; i++) {
      map[i] = br.readLine();
      Arrays.fill(warp_count[i], Integer.MAX_VALUE);
    }
    Player start = new Player(ch, cw);
    int now_warp_count = 0;
    warp_count[ch][cw] = now_warp_count;
    Queue<Player> queue = new ArrayDeque<>();
    Queue<Player> queue2 = new ArrayDeque<>();
    TreeSet<Player> set = new TreeSet<>();
    queue2.add(start);
    while (!queue2.isEmpty()) {
      queue.addAll(queue2);
      queue2.clear();
      while (!queue.isEmpty()) {
        Player player = queue.poll();
        if (warp_count[player.h][player.w] < now_warp_count) {
          continue;
        }
        if (player.h == dh && player.w == dw) {
          continue;
        }
        // Up
        if (player.h - 1 >= 0 && map[player.h - 1].charAt(player.w) == '.'
            && warp_count[player.h - 1][player.w] > now_warp_count) {
          warp_count[player.h - 1][player.w] = now_warp_count;
          queue.add(new Player(player.h - 1, player.w));
        }
        // Down
        if (player.h + 1 < h && map[player.h + 1].charAt(player.w) == '.'
            && warp_count[player.h + 1][player.w] > now_warp_count) {
          warp_count[player.h + 1][player.w] = now_warp_count;
          queue.add(new Player(player.h + 1, player.w));
        }
        // Left
        if (player.w - 1 >= 0 && map[player.h].charAt(player.w - 1) == '.'
            && warp_count[player.h][player.w - 1] > now_warp_count) {
          warp_count[player.h][player.w - 1] = now_warp_count;
          queue.add(new Player(player.h, player.w - 1));
        }
        // Right
        if (player.w + 1 < w && map[player.h].charAt(player.w + 1) == '.'
            && warp_count[player.h][player.w + 1] > now_warp_count) {
          warp_count[player.h][player.w + 1] = now_warp_count;
          queue.add(new Player(player.h, player.w + 1));
        }
        for (int i = player.h - 2; i <= player.h + 2; i++) {
          for (int j = player.w - 2; j <= player.w + 2; j++) {
            if (i >= 0 && i < h && j >= 0 && j < w && i != player.h && j != player.w
                && map[i].charAt(j) == '.'
                && warp_count[i][j] > now_warp_count + 1) {
              warp_count[i][j] = now_warp_count + 1;
              set.add(new Player(i, j));
            }
          }
        }
      }
      now_warp_count++;
      for(Player p : set){
        if(warp_count[p.h][p.w] == now_warp_count){
          queue2.add(p);
        }
      }
      set.clear();
    }
    System.out.println(warp_count[dh][dw] == Integer.MAX_VALUE ? -1 : warp_count[dh][dw]);
  }

  static class Player implements Comparable<Player> {
    int h;
    int w;

    public Player(int h, int w) {
      this.h = h;
      this.w = w;
    }

    @Override
    public int compareTo(Player o) {
      if(this.h != o.h){
        return Integer.compare(this.h, o.h);
      }
      return Integer.compare(this.w, o.w);
    }
  }
}