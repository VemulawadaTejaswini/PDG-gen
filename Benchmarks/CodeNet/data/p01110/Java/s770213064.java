import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long start = System.nanoTime();
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();
            int p = sc.nextInt();
            if (n == 0 && m == 0 && t == 0 && p == 0)
                break;

            int[][] paper = initializeArray(n, m);

            for (int i=0; i < t; i++) {
                int d = sc.nextInt();
                int c = sc.nextInt();
                int[][] newPaper;
                if (d == 1) {
                    int newWidth = paper.length > 2 * c ? paper.length - c : c;
                    newPaper = new int[newWidth][paper[0].length];

                    for (int w=c; w < paper.length; w++) {
                        for (int h=0; h < paper[0].length; h++) {
                            newPaper[w - c][h] = paper[w][h];
                        }
                    }

                    for (int w=0; w < c; w++) {
                        for (int h=0; h < paper[0].length; h++) {
                            newPaper[c - w - 1][h] += paper[w][h];
                        }
                    }
                } else {
                    int newHeight = paper[0].length > 2 * c ? paper[0].length - c : c;
                    newPaper = new int[paper.length][newHeight];

                    for (int w=0; w < paper.length; w++) {
                        for (int h=c; h < paper[0].length; h++) {
                            newPaper[w][h - c] = paper[w][h];
                        }
                    }

                    for (int w=0; w < paper.length; w++) {
                        for (int h=0; h < c; h++) {
                            newPaper[w][c - h - 1] += paper[w][h];
                        }
                    }
                }

                paper = newPaper;
                // System.out.println(Arrays.deepToString(paper));
            }

            for (int i=0; i < p; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println(paper[x][y]);
            }
        }

        long time = System.nanoTime() - start;
        // System.out.printf("Took %s ms.\n", time/1_000_000d);
    }

    private static int[][] initializeArray(int n, int m) {
        int[][] ret = new int[n][m];
        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++)
                ret[i][j] = 1;
        }
        return ret;
    }


}
