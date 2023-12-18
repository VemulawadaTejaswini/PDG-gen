import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            boolean[][] r = new boolean[9][9];
            int[][] l = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    l[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 9; i++) {
                int[] c1 = new int[10];
                int[] c2 = new int[10];
                int[] c3 = new int[10];
                for (int j = 0; j < 9; j++) {
                    if (++c1[l[i][j]] > 1) {
                        r[i][j] = true;
                        for (int k = j - 1; k >= 0; k--) {
                            if (l[i][j] == l[i][k]) {
                                r[i][k] = true;
                                break;
                            }
                        }
                    }
                    if (++c2[l[j][i]] > 1) {
                        r[j][i] = true;
                        for (int k = j - 1; k >= 0; k--) {
                            if (l[j][i] == l[k][i]) {
                                r[k][i] = true;
                                break;
                            }
                        }
                    }
                    int y = i / 3 * 3 + j / 3, x = i % 3 * 3 + j % 3;
                    if (++c3[l[y][x]] > 1) {
                        r[y][x] = true;
                        for (int k = j - 1; k >= 0; k--) {
                            int yk = i / 3 * 3 + k / 3, xk = i % 3 * 3 + k % 3;
                            if (l[y][x] == l[yk][xk]) {
                                r[yk][xk] = true;
                                break;
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < 9; i++) {
                String s = "";
                for (int j = 0; j < 9; j++) {
                    s += (r[i][j] ? "*" : " ") + l[i][j];
                }
                System.out.println(s);
            }
            if (n > 1) {
                System.out.println();
            }
        }
    }
}

