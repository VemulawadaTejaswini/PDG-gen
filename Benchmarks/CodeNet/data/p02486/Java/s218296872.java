import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (;;) {
            String line = br.readLine();
            String[] ss = line.split(" ");
            int n = Integer.parseInt(ss[0]);
            int x = Integer.parseInt(ss[1]);
            if (n == 0 && x == 0) {
                break;
            }
            int c = 0;
            for (int ii = 1; ii <= n - 2; ii++) {
                for (int jj = ii + 1; jj <= n - 1; jj++) {
                    for (int kk = jj + 1; kk <= n; kk++) {
                        if (ii + jj + kk == x) {
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}