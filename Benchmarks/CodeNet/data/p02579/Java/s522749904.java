import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

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
    Player start = new Player(ch, cw, 0);
    Queue<Player> queue = new ArrayDeque<>();
    Queue<Player> queue2 = new ArrayDeque<>();
    queue2.add(start);
    while (!queue2.isEmpty()) {
      queue.addAll(queue2);
      queue2.clear();
      while (!queue.isEmpty()) {
        Player player = queue.poll();
        if (warp_count[player.h][player.w] < player.warp) {
          continue;
        }
        if (player.h == dh && player.w == dw) {
          continue;
        }
        // Up
        if (player.h - 1 >= 0 && map[player.h - 1].charAt(player.w) == '.'
            && warp_count[player.h - 1][player.w] > player.warp) {
          warp_count[player.h - 1][player.w] = player.warp;
          queue.add(new Player(player.h - 1, player.w, player.warp));
        }
        // Down
        if (player.h + 1 < h && map[player.h + 1].charAt(player.w) == '.'
            && warp_count[player.h + 1][player.w] > player.warp) {
          warp_count[player.h + 1][player.w] = player.warp;
          queue.add(new Player(player.h + 1, player.w, player.warp));
        }
        // Left
        if (player.w - 1 >= 0 && map[player.h].charAt(player.w - 1) == '.'
            && warp_count[player.h][player.w - 1] > player.warp) {
          warp_count[player.h][player.w - 1] = player.warp;
          queue.add(new Player(player.h, player.w - 1, player.warp));
        }
        // Right
        if (player.w + 1 < w && map[player.h].charAt(player.w + 1) == '.'
            && warp_count[player.h][player.w + 1] > player.warp) {
          warp_count[player.h][player.w + 1] = player.warp;
          queue.add(new Player(player.h, player.w + 1, player.warp));
        }
        for (int i = player.h - 2; i <= player.h + 2; i++) {
          for (int j = player.w - 2; j <= player.w + 2; j++) {
            if (i >= 0 && i < h && j >= 0 && j < w && i != player.h && j != player.w
                && map[i].charAt(j) == '.'
                && warp_count[i][j] > player.warp + 1) {
              warp_count[i][j] = player.warp + 1;
              queue2.add(new Player(i, j, player.warp + 1));
            }
          }
        }
      }
    }
    System.out.println(warp_count[dh][dw] == Integer.MAX_VALUE ? -1 : warp_count[dh][dw]);
  }

  static class Player {

    int h;
    int w;
    int warp;

    public Player(int h, int w, int warp) {
      this.h = h;
      this.w = w;
      this.warp = warp;
    }
  }
}
