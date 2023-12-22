import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        String[] S = new String[H + 2];
        for (int i = 0; i <= H + 1; i++) {
            S[i] ="";
            if (i == 0 || i == H + 1) {
                for (int j = 0; j <= W + 1; j++) {
                    S[i] = S[i] + " ";
                }
            }else {
                S[i] = " " + sc.next() + " ";
            }
        }
        String[][] result = new String[H][W];
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if (S[i].charAt(j) == '#') {
                    result[i - 1][j - 1] = "#";
                }else {
                    int count = 0;
                    if (S[i - 1].charAt(j - 1) == '#') {
                        count++;
                    }
                    if (S[i - 1].charAt(j) == '#') {
                        count++;
                    }
                    if (S[i - 1].charAt(j + 1) == '#') {
                        count++;
                    }
                    if (S[i].charAt(j - 1) == '#') {
                        count++;
                    }
                    if (S[i].charAt(j + 1) == '#') {
                        count++;
                    }
                    if (S[i + 1].charAt(j - 1) == '#') {
                        count++;
                    }
                    if (S[i + 1].charAt(j) == '#') {
                        count++;
                    }
                    if (S[i + 1].charAt(j + 1) == '#') {
                        count++;
                    }
                    result[i - 1][j - 1] = String.valueOf(count);
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
