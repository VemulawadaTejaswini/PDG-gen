import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // # In
            // area
            int H = Integer.parseInt(sc.next());    // height
            int W = Integer.parseInt(sc.next());    // width

            // mine
            int M = Integer.parseInt(sc.next());
            int[] hnum = new int[H];
            int[] wnum = new int[W];
            List<Integer>[] mines = new ArrayList[H];
            for (int i = 0; i < M; i++) {
                int hi = Integer.parseInt(sc.next()) - 1;
                int wi = Integer.parseInt(sc.next()) - 1;
                hnum[hi]++;
                wnum[wi]++;

                if (mines[hi] == null) {
                    mines[hi] = new ArrayList<Integer>();
                    mines[hi].add(wi);
                } else {
                    mines[hi].add(wi);
                }
            }

            // # Solve
            int hmax = 0, wmax = 0;
            List<Integer> hmax_index = new ArrayList<>();
            List<Integer> wmax_index = new ArrayList<>();
            for (int i = 0; i < H; i++) {
                if (hmax < hnum[i]) {
                    hmax = hnum[i];
                    hmax_index.clear();
                    hmax_index.add(i);
                } else if (hmax == hnum[i]) {
                    hmax_index.add(i);
                }
            }
            for (int i = 0; i < W; i++) {
                if (wmax < wnum[i]) {
                    wmax = wnum[i];
                    wmax_index.clear();
                    wmax_index.add(i);
                } else if (wmax == wnum[i]) {
                    wmax_index.add(i);
                }
            }

            boolean hit = false;
            for (int h : hmax_index) {
                for (int maxw : wmax_index) {
                    if (!mines[h].contains(maxw)) {
                        hit = true;
                    }
                }
                if (hit) break;
            }
            System.out.println(hmax + wmax + (hit ? 0 : -1));
        }
    }
}