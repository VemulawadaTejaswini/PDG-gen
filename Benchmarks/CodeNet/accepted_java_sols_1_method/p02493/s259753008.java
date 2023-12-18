import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = 0;
        for (int ii = 0; ii < 2; ii++) {
            String line = br.readLine();
            if (ii == 0) {
                continue;
            }
            String[] ss = line.split(" ");
            for (int jj = ss.length - 1; jj >= 0; jj--) {
                System.out.print(ss[jj]);
                if (jj != 0) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}