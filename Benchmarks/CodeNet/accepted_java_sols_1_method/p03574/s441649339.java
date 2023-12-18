import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int ans = 0;
        String A[] = new String[H];
        String mine[][] = new String[H][W];
        for (int z = 0; H > z; z++) {
            A[z] = sc.next();
        }
        for (int i = 0; H > i; i++) {
            for (int j = 0; W > j; j++) {
                char tmp = A[i].charAt(j);
                mine[i][j] = String.valueOf(tmp);
            }
        }
        for (int s = 0; H > s; s++) {
            for (int e = 0; W > e; e++) {
                ans = 0;
                if (!"#".equals(mine[s][e])) {
                    if (s - 1 >= 0 && e - 1 >= 0) {
                        if ("#".equals(mine[s - 1][e - 1])) {
                            ans++;
                        }
                    }
                    if (s - 1 >= 0) {
                        if ("#".equals(mine[s - 1][e])) {
                            ans++;
                        }
                    }
                    if (s - 1 >= 0 && e + 1 < W) {
                        if ("#".equals(mine[s - 1][e + 1])) {
                            ans++;
                        }
                    }
                    if (e - 1 >= 0) {
                        if ("#".equals(mine[s][e - 1])) {
                            ans++;
                        }
                    }
                    if (e + 1 < W) {
                        if ("#".equals(mine[s][e + 1])) {
                            ans++;
                        }
                    }
                    if (s + 1 < H && e - 1 >= 0) {
                        if ("#".equals(mine[s + 1][e - 1])) {
                            ans++;
                        }
                    }
                    if (s + 1 < H) {
                        if ("#".equals(mine[s + 1][e])) {
                            ans++;
                        }
                    }
                    if (s + 1 < H && e + 1 < W) {
                        if ("#".equals(mine[s + 1][e + 1])) {
                            ans++;
                        }
                    }
                    System.out.print(ans);
                } else {
                    System.out.print(mine[s][e]);
                }
            }
            System.out.println("");
        }
    }
}
