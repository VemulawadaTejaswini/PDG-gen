import java.util.Scanner;

public class Main {
    public int getMaxTargetsDestroyable(int h, int w, int[][] targets) {
        boolean[][] isTarget = new boolean[h][w];
        int[] rows = new int[h];
        int[] cols = new int[w];

        for (int i = 0; i < targets.length; i++) {
            int targetRow = targets[i][0] - 1;
            int targetCol = targets[i][1] - 1;

            isTarget[targetRow][targetCol] = true;
            rows[targetRow]++;
            cols[targetCol]++;
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int targetsDestroyable = rows[i] + cols[j];
                if (isTarget[i][j]) targetsDestroyable--;
                max = Math.max(max, targetsDestroyable);
            }
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w  = scanner.nextInt();
        int m  = scanner.nextInt();
        int[][] targets = new int[m][2];
        for (int i = 0; i < m; i++) {
            targets[i][0] = scanner.nextInt();
            targets[i][1] = scanner.nextInt();
        }

        int answer = solution.getMaxTargetsDestroyable(h, w, targets);
        System.out.println(answer);
    }
}