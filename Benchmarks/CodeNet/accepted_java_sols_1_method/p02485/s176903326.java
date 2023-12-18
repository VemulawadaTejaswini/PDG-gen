import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (;;) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }
            int a = 0;
            for (int ii = 0; ii < line.length(); ii++) {
                a += Integer.parseInt(line.substring(ii, ii + 1));
            }
            System.out.println(a);
        }
    }
}