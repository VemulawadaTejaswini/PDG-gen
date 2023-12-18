import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        // 添字0は使わない
        int Hei[] = new int[h * w + 1];
        int Wid[] = new int[h * w + 1];
        int a[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
                Hei[a[i][j]] = i + 1;
                Wid[a[i][j]] = j + 1;
            }
        }
        int dis[] = new int[h * w + 1];
        for (int i = 0; i < d + 1; i++) {
            dis[i] = 0;
        }
        for (int i = d + 1; i < h * w + 1; i++) {
            dis[i] = dis[i - d] + Math.abs(Hei[i] - Hei[i - d]) + Math.abs(Wid[i] - Wid[i - d]);
        }
        int q = sc.nextInt();
        int le[] = new int[q];
        int ri[] = new int[q];

        for (int i = 0; i < q; i++) {
            le[i] = sc.nextInt();
            ri[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int ans = dis[ri[i]] - dis[le[i]];
            System.out.println(ans);
        }
    }
}