import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 読み込んでフィールドを作る
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 && y == 0) {
                break;
            }

            Pachimon pachimon = new Pachimon();
            for (int fy = 0; fy < y; fy++) {
                String in = sc.next();

                for (int fx = 0; fx < x; fx++) {
                    char c = in.charAt(fx);

                    switch (c) {
                    case 'S':
                        pachimon.setStart(new Pos(fx, fy));
                        break;
                    case 'G':
                        pachimon.setGoal(new Pos(fx, fy));
                        break;
                    case '1':
                        pachimon.addPachimon(0, new Pos(fx, fy));
                        break;
                    case '2':
                        pachimon.addPachimon(1, new Pos(fx, fy));
                        break;
                    case '3':
                        pachimon.addPachimon(2, new Pos(fx, fy));
                        break;
                    case '4':
                        pachimon.addPachimon(3, new Pos(fx, fy));
                        break;
                    case '5':
                        pachimon.addPachimon(4, new Pos(fx, fy));
                        break;
                    default:
                        break;
                    }
                }
            }

            pachimon.search();

        }
    }

    /** 場所 */
    private static class Pos {
        public int x;

        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class Pachimon {
        private List<List<Pos>> pachimon = new ArrayList<List<Pos>>();

        private Pos s;

        private Pos g;

        public Pachimon() {
            for (int i = 0; i < 5; i++) {
                this.pachimon.add(new ArrayList<Pos>());
            }
        }

        /** なんだかロジックに落とし穴がありそう。MAX_VALUEだとオーバーフローしてくれちゃう。 */
        private static int max = 999999;

        public void setStart(Pos s) {
            this.s = s;
        }

        public void setGoal(Pos g) {
            this.g = g;
        }

        public void addPachimon(int elem, Pos pos) {
            this.pachimon.get(elem).add(pos);
        }

        public void search() {

            int start = -1;
            int dist = max;

            for (int i = 0; i < 5; i++) {
                int[][] dp = new int[5][1024];
                for (int h = 0; h < 5; h++) {
                    Arrays.fill(dp[h], max);
                }

                int first = (i + 1) % 5;

                for (int j = 0; j < this.pachimon.get(first).size(); j++) {
                    // s→e1
                    dp[first][j] = dist(this.s, this.pachimon.get(first).get(j));
                }

                int now = first;

                for (int e = 0; e < 4; e++) {
                    now = (now + e) % 5;
                    int next = (now + 1) % 5;
                    for (int j = 0; j < this.pachimon.get(now).size(); j++) {
                        for (int k = 0; k < this.pachimon.get(next).size(); k++) {
                            dp[next][k] = Math.min(
                                    dp[next][k],
                                    dp[now][j]
                                            + dist(this.pachimon.get(now)
                                                    .get(j),
                                                    this.pachimon.get(next)
                                                            .get(k)));
                        }
                    }
                }

                now = (now + 1) % 5;
                for (int j = 0; j < this.pachimon.get(now).size(); j++) {

                    int d = dp[now][j]
                            + dist(this.pachimon.get(now).get(j), this.g);

                    if (d < dist) {
                        dist = d;
                        start = i + 1;
                    }

                }

            }
            if (start == -1) {
                System.out.println("NA");
            } else {
                System.out.println(start + " " + dist);
            }

        }

        private static int dist(Pos from, Pos to) {
            return Math.abs(from.x - to.x) + Math.abs(from.y - to.y);
        }
    }

}