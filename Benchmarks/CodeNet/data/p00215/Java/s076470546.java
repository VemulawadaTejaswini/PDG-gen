import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int INF = 1 << 30;

    public static void main(String[] args) {
        // 読み込んでフィールドを作る
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final int width = sc.nextInt();
            final int height = sc.nextInt();

            if (width == 0 && height == 0) {
                break;
            }

            int start = 0;
            int goal = 0;
            ArrayList<ArrayList<Integer>> elem = new ArrayList<ArrayList<Integer>>(
                    5);
            elem.add(new ArrayList<Integer>());
            elem.add(new ArrayList<Integer>());
            elem.add(new ArrayList<Integer>());
            elem.add(new ArrayList<Integer>());
            elem.add(new ArrayList<Integer>());

            for (int y = 0; y < height; y++) {
                final char[] rowData = sc.next().toCharArray();

                for (int x = 0; x < width; x++) {
                    final char c = rowData[x];

                    if (c == '.') {
                        // not any
                    } else if (c == '1' || c == '2' || c == '3' || c == '4'
                            || c == '5') {
                        elem.get(Character.getNumericValue(c) - 1).add(
                                pos(x, y));
                    } else if (c == 'S') {
                        start = pos(x, y);
                    } else {
                        goal = pos(x, y);
                    }

                }
            }

            // search
            int nearestDistance = INF;
            int bestElement = -1;
            for (int selectElem = 0; selectElem < 5; selectElem++) {
                int[][] dp = new int[5][1000];
                for (int h = 0; h < 5; h++) {
                    Arrays.fill(dp[h], INF);
                }

                int now = (selectElem + 1) % 5;
                ArrayList<Integer> elemNow = elem.get(now);
                for (int i = 0; i < elemNow.size(); i++) {
                    // s→e1を計算
                    dp[now][i] = dist(start, elemNow.get(i));
                }

                // s->1->2->3->4->g
                // なので、ループは間の-> * 3分まわす
                int next = (now + 1) % 5;
                ArrayList<Integer> elemNext = null;
                for (int e = 0; e < 3; e++) {
                    // e(x)->e(x+1)
                    next = (now + 1) % 5;
                    elemNext = elem.get(next);
                    for (int i = 0; i < elemNow.size(); i++) {
                        if (elemNow.get(i) > nearestDistance) {
                            // 既に決まっている最短距離を超えたら絶対に候補ではない
                            continue;
                        }

                        for (int j = 0; j < elemNext.size(); j++) {
                            dp[next][j] = min(
                                    dp[next][j],
                                    dp[now][i]
                                            + dist(elemNow.get(i),
                                                    elemNext.get(j))); // メモと新しい経路の最短
                        }
                    }

                    now = next;
                    elemNow = elemNext;
                }

                for (int i = 0; i < elemNext.size(); i++) {
                    // e4->g
                    int currentDistance = dp[next][i]
                            + dist(elemNext.get(i), goal);

                    if (currentDistance < nearestDistance) {
                        nearestDistance = currentDistance;
                        bestElement = selectElem + 1;
                    }

                }

            }

            if (nearestDistance == INF) {
                System.out.println("NA");
            } else {
                System.out.println(bestElement + " " + nearestDistance);
            }

        }
    }

    private static final int dist(final int from, final int to) {
        return abs((from >> 11) - (to >> 11))
                + abs((from & 2047) - (to & 2047));
    }

    private static final int min(final int a, final int b) {
        return b + ((a - b) & ((a - b) >> 31));
    }

    private static final int pos(final int a, final int b) {
        return (a << 11) + b;
    }

    private static final int abs(final int a) {
        return (a ^ (a >> 31)) - (a >> 31);
    }

}