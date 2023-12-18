import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] rows = new int[n + 1];
        int[] cols = new int[n + 1];
        char[][] field = new char[h][];
        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (field[i][j] == 'X' || field[i][j] == '.') {
                    continue;
                }
                if (field[i][j] == 'S') {
                    rows[0] = i;
                    cols[0] = j;
                } else {
                    rows[field[i][j] - '0'] = i;
                    cols[field[i][j] - '0'] = j;
                }
            }
        }
        int[][] costs = new int[h][w];
        int start = 0;
        for (int i = 1; i <= n; i++) {
            init(costs);
            PriorityQueue<Path> queue = new PriorityQueue<>();
            queue.add(new Path(rows[i - 1], cols[i - 1], start));
            while (queue.size() > 0) {
                Path p = queue.poll();
                if (p.row == rows[i] && p.col == cols[i]) {
                    start = p.value;
                    break;
                }
                if (costs[p.row][p.col] <= p.value) {
                    continue;
                }
                costs[p.row][p.col] = p.value;
                if (p.row > 0 && field[p.row - 1][p.col] != 'X') {
                    queue.add(new Path(p.row - 1, p.col, p.value + 1));
                }
                if (p.row < h - 1 && field[p.row + 1][p.col] != 'X') {
                    queue.add(new Path(p.row + 1, p.col, p.value + 1));
                }
                if (p.col > 0 && field[p.row][p.col - 1] != 'X') {
                    queue.add(new Path(p.row, p.col - 1, p.value + 1));
                }
                if (p.col < w - 1 && field[p.row][p.col + 1] != 'X') {
                    queue.add(new Path(p.row, p.col + 1, p.value + 1));
                }
            }
        }
        System.out.println(start);
    }
    
    static void init(int[][] arr) {
        for (int[] each : arr) {
            Arrays.fill(each, Integer.MAX_VALUE);
        }
    }
    
    static class Path implements Comparable<Path> {
        int row;
        int col;
        int value;
        
        public Path (int row, int col, int value) {
            this.row = row;
            this.col = col;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}

