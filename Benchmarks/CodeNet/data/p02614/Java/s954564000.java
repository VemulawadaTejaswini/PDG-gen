import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int[][] b = new int[H][W];
        for (int i = 0; i < b.length; i++) {
            String s = sc.next();
            for (int j = 0; j < b[i].length; j++) {
                if (s.charAt(j) == '.') {
                    b[i][j] = 0;
                } else {
                    b[i][j] = 1;
                }
            }
        }
        int counter = 0;
        for (int bit1 = 0; bit1 < (1<<H); bit1++) {
            int[][] copy = new int[H][W];
            for (int i = 0; i < copy.length; i++) {
                for (int j = 0; j < copy[i].length; j++) {
                    copy[i][j] = b[i][j];
                }
            }
            for (int i = 0; i < H; i++) {
                if ((bit1 & (1<<i)) != 0) {
                    for (int j = 0; j < copy[i].length; j++) {
                        copy[i][j] = -1;
                    }
                }
            }
            for (int bit2 = 0; bit2 < (1<<W); bit2++) {
                int[][] copy2 = new int[H][W];
                for (int i = 0; i < copy2.length; i++) {
                    for (int j = 0; j < copy2[i].length; j++) {
                        copy2[i][j] = copy[i][j];
                    }
                }
                for (int i = 0; i < W; i++) {
                    if ((bit2 & (1<<i)) != 0) {
                        for (int j = 0; j < copy2.length; j++) {
                            copy2[j][i] = -1;
                        }
                    }
                }
                int sum = 0;
                for (int i = 0; i < copy2.length; i++) {
                    for (int j = 0; j < copy2[i].length; j++) {
                        if (copy2[i][j] == 1) {
                            sum++;
                        }
                    }
                }
                if (sum == K) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        sc.close();
    }
}