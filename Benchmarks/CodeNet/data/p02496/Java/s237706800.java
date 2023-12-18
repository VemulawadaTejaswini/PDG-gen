import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = 0;
        boolean[][] cards = new boolean[4][14];
        for (int ii = 0;; ii++) {
            if (ii == n + 1) {
                break;
            }
            String line = br.readLine();
            if (ii == 0) {
                n = Integer.parseInt(line);
                if (n == 0) {
                    break;
                }
                continue;
            }
            String[] ss = line.split(" ");
            String s = ss[0];
            int num = Integer.parseInt(ss[1]);
            if (s.equals("S")) {
                cards[0][num] = true;
            } else if (s.equals("H")) {
                cards[1][num] = true;
            } else if (s.equals("C")) {
                cards[2][num] = true;
            } else if (s.equals("D") == true) {
                cards[3][num] = true;
            }
        }
        for (int ii = 0; ii < 4; ii++) {
            for (int jj = 1; jj < 14; jj++) {
                if (cards[ii][jj]) {
                    continue;
                }
                String s = "";
                if (ii == 0) {
                    s = "S";
                } else if (ii == 1) {
                    s = "H";
                } else if (ii == 2) {
                    s = "C";
                } else if (ii == 3) {
                    s = "D";
                }
                System.out.println(s + " " + jj);
            }
        }
    }
}