import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int c[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int a[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int t = 0; t < 10; t++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    int min = c[i][j];
                    for (int k = 0; k < 10; k++) {
                        int cost = c[i][k] + c[k][j];
                        min = Math.min(min, cost);
                    }
                    c[i][j] = min;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j] == -1) {
                    continue;
                }
                ans += c[a[i][j]][1];
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
