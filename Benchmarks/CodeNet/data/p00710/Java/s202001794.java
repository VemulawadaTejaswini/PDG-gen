import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        while (true) {
            int n = inScanner.nextInt();
            int r = inScanner.nextInt();

            if (n == 0 && r == 0) {
                break;
            }

            int[][] card = new int[r+1][n];
            for (int i = 0; i < n; i++) {
                card[0][i] = n - i;
            }

            for (int i = 0; i < r; i++) {
                int p = inScanner.nextInt();
                int c = inScanner.nextInt();

                for (int j = 0; j < n; j++) {
                    if (j < c) {
                        card[i+1][j] = card[i][p-1+j];
                    }
                    else if (j >= (p-1)+c) {
                        card[i+1][j] = card[i][j-c];
                    }
                    else {
                        card[i+1][j] = card[i][j];
                    }
                }
            }
            System.out.println(card[r][0] +1);
        }
    }
}