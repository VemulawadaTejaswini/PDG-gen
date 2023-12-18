import java.io.*;
import java.util.*;

public class Main {

    public static final int NA = -1;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        final int q = in.readLineAsInt();
        for (int i = 0; i < q; i++) {
            String A = in.readLine();
            String B = in.readLine();
            System.out.println(lcsRoot(A, B));
        }
    }


    private int lcsRoot(String a, String b) {
        int[][] memo = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], NA);
        }
        return lcs(a, b, a.length(), b.length(), memo);
    }

    private int lcs(String a, String b, int i, int j, int[][] memo) {
        if (memo[i][j] != NA) {
            return memo[i][j];
        } else if (i == 0 || j == 0) {
            memo[i][j] = 0;
            return 0;
        } else {
            int lcs = 0;
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                lcs = lcs(a, b, i - 1, j - 1, memo) + 1;
            } else {
                lcs = Math.max(lcs(a, b, i - 1, j, memo), lcs(a, b, i, j - 1, memo));
            }
            memo[i][j] = lcs;
            return lcs;
        }
    }

    static class CustomReader extends BufferedReader {

        //private static final int DEFAULT_BUF_SIZE = 2048;
        private static final int DEFAULT_BUF_SIZE = 4096;
        //private static final int DEFAULT_BUF_SIZE = 8192;
        //private static final int DEFAULT_BUF_SIZE = 16384;
        // private static final int DEFAULT_BUF_SIZE = 1048576;

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in), DEFAULT_BUF_SIZE);
        }


        public int readLineAsInt() throws IOException {
            return Integer.parseInt(this.readLine());
        }


        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public int[][] readAsIntMatrix(int rows, int columns) throws IOException {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                String[] r = this.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(r[j]);
                }
            }
            return matrix;
        }
    }
}
