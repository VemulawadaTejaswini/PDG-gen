import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[][] l = new int[n][n];
            int nx = n / 2;
            int ny = n / 2 + 1;
            l[ny][nx] = 1;
            for (int i = 2; i <= n * n; i++) {
                nx++;
                ny++;
                if (ny >= n) {
                    if (nx >= n) {
                        nx--;
                    }
                    for (int j = 0; j < n; j++) {
                        if (l[j][nx] == 0) {
                            l[j][nx] = i;
                            ny = j;
                            break;
                        }
                    }
                    continue;
                }
                if (nx >= n) {
                    for (int j = 0; j < n; j++) {
                        if (l[ny][j] == 0) {
                            l[ny][j] = i;
                            nx = j;
                            break;
                        }
                    }
                    continue;
                }
                if (l[ny][nx] != 0) {
                    nx--;
                    ny=++ny>=n?0:ny;
                }
                l[ny][nx] = i;
            }
            p(l);
        }
    }

    static void p(int[][] l) {
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[0].length; j++) {
                System.out.printf("%4d", l[i][j]);
            }
            System.out.println();
        }
    }
}
