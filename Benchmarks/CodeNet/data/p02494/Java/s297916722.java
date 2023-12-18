import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (;;) {
            String line = br.readLine();
            String[] ss = line.split(" ");
            int h = Integer.parseInt(ss[0]);
            int w = Integer.parseInt(ss[1]);
            if (h == 0 && w == 0) {
                break;
            }
            for (int ii = 0; ii < h; ii++) {
                for (int jj = 0; jj < w; jj++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}