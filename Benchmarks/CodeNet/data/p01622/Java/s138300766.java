import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTwinBookReport solver = new CTwinBookReport();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTwinBookReport {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            while (n != 0) {
                CTwinBookReport.Book[] books = new CTwinBookReport.Book[n];
                int totalRead = 0, totalWrite = 0;
                for (int i = 0; i < n; i++) {
                    books[i] = new CTwinBookReport.Book(in.nextInt(), in.nextInt());
                    totalRead += books[i].r;
                    totalWrite += books[i].w;
                }
                Arrays.sort(books, Comparator.comparing(book -> -book.r));

                int voidTime = Math.max(0, books[0].r - (totalRead - books[0].r));
                //System.out.println("(READ, WRITE) = (" + totalRead + ", " + totalWrite + ")");
                //System.out.println("VOID TIME IS " + voidTime);
                int finishTime = totalRead + voidTime; // 読み終わり

                boolean[][] dp = new boolean[n][];
                dp[0] = new boolean[voidTime + 1];
                dp[0][0] = true;
                for (int i = 1; i < n; i++) {
                    dp[i] = dp[i - 1].clone();
                    //System.out.print(books[i].w + " ");
                    for (int j = 0; j <= voidTime - books[i].w; j++) {
                        dp[i][j + books[i].w] |= dp[i - 1][j];
                    }
                }
                //System.out.println(Arrays.toString(dp));
                for (int i = voidTime; ; i--) {
                    if (dp[n - 1][i]) {
                        //System.out.println("REDUCED TIME IS "+ i);
                        out.println(finishTime + totalWrite - i);
                        break;
                    }
                }

                n = in.nextInt();
            }
        }

        private static class Book {
            int r;
            int w;

            Book(int r, int w) {
                this.r = r;
                this.w = w;
            }

        }

    }
}


