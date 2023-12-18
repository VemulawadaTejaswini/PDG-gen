import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] s = new String[h][w];
        String[][] ans = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int count = 0;
                if (s[i][j].equals("#")) {
                    ans[i][j] = "#";
                } else {
                    try {
                        if (s[i - 1][j - 1].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    try {
                        if (s[i - 1][j].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    try {
                        if (s[i - 1][j + 1].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    try {
                        if (s[i][j - 1].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    try {
                        if (s[i][j + 1].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    try {
                        if (s[i + 1][j - 1].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    try {
                        if (s[i + 1][j].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    try {
                        if (s[i + 1][j + 1].equals("#"))
                            count++;
                    } catch (Exception e) {
                    }
                    ans[i][j] = String.valueOf(count);
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
