import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < q; i++) {
            char[] X = br.readLine().toCharArray();
            char[] Y = br.readLine().toCharArray();
            sb.append(LCS(X, Y, X.length - 1, Y.length - 1));
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static int LCS(char[] X, char[] Y, int i, int j) {
        if (i == -1 || j == -1) {
            return 0;
        } else if (X[i] == Y[j]) {
            return LCS(X, Y, i - 1, j - 1) + 1;
        } else {
            return Math.max(LCS(X, Y, i - 1, j), LCS(X, Y, i, j - 1));
        }
    }
}