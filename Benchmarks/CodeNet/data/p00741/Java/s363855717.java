
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer w = Integer.parseInt(scan.next());
        Integer h = Integer.parseInt(scan.next());

        List<Problem> problemList = new ArrayList<Problem>();
        while (w != 0 && h != 0) {
            int[][] sea = new int[h][w];
            for (int i = 0; i < sea.length; i++) {
                for (int j = 0; j < sea[i].length; j++) {
                    sea[i][j] = Integer.parseInt(scan.next());
                }
            }
            problemList.add(new Problem(sea));

            w = Integer.parseInt(scan.next());
            h = Integer.parseInt(scan.next());
        }
        scan.close();

        int[] answer = new int[problemList.size()];
        for (int p = 0; p < problemList.size(); p++) {
            Problem problem = problemList.get(p);
            int[][] sea = problem.sea_;
            boolean[][] done = problem.done_;
            int count = 0;

            for (int i = 0; i < sea.length; i++) {
                for (int j = 0; j < sea[0].length; j++) {
                    if (!done[i][j] && sea[i][j] == 1) {
                        count++;
                        dfs(i, j, sea, done);
                    }
                }
            }

            answer[p] = count;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static void dfs(int i, int j, int[][] sea, boolean[][] done) {
        done[i][j] = true;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int ni = i + dx;
                int nj = j + dy;

                if (ni < 0 || ni >= sea.length || nj < 0 || nj >= sea[0].length) {
                    continue;
                }
                if (done[ni][nj] || sea[ni][nj] == 0) {
                    continue;
                }
                dfs(ni, nj, sea, done);
            }
        }
    }

}

class Problem {

    int[][] sea_;

    boolean[][] done_;

    public Problem(int[][] sea) {
        sea_ = sea;
        done_ = new boolean[sea.length][sea[0].length];
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                done_[i][j] = false;
            }
        }
    }
}

