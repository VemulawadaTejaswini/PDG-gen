import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        Whist solver = new Whist();
        solver.solve(1, in, out);
        out.close();
    }

    static class Whist {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            while (true) {
                String trump = in.nextLine();
                if (trump.equals("#")) break;
                String[][] cards = new String[4][];
                for (int i = 0; i < 4; i++) {
                    cards[i] = in.nextLine().split(" ");
                    assert cards[i].length == 13;
                }
                int ns = 0, ew = 0;
                // NSEW
                int par = 0;
                for (int i = 0; i < 13; i++) {
                    int win = par;
                    String pcard = cards[par][i];
                    for (int j = 0; j < 4; j++) {
                        if (par != j) {
                            if (pcard.charAt(1) != cards[j][i].charAt(1)) continue;
                            if (comp(cards[j][i].charAt(0), pcard.charAt(0))) {
                                win = j;
                            }
                        }
                    }
                    if (win % 2 == 0) ns++;
                    else ew++;
                    par = win;
                }
                out.println((ns < ew ? "EW" : "NS") + " " + Integer.toString(Math.max(ns, ew) - 7));
            }
        }

        public boolean comp(char c1, char c2) {
            if (c1 == 'A') return true;
            if (c2 == 'A') return false;
            int n1 = c1 == 'T' ? 10 : c1 == 'J' ? 11 : c1 == 'Q' ? 12 : c1 == 'K' ? 13 : c1 - '0';
            int n2 = c2 == 'T' ? 10 : c2 == 'J' ? 11 : c2 == 'Q' ? 12 : c2 == 'K' ? 13 : c2 - '0';
            return n1 > n2;
        }

    }
}