import java.io.*;
import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Long.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);

        int x = parseInt(read.readLine());

        if (x >= 400 && x <= 599) {
            prnt.println(8);
        } else if (x >= 600 && x <= 799) {
            prnt.println(7);
        } else if (x >= 800 && x <= 999) {
            prnt.println(6);
        } else if (x >= 1000 && x <= 1199) {
            prnt.println(5);
        } else if (x >= 1200 && x <= 1399) {
            prnt.println(4);
        } else if (x >= 1400 && x <= 1599) {
            prnt.println(3);
        } else if (x >= 1600 && x <= 1799) {
            prnt.println(2);
        } else if (x >= 1800 && x <= 1999) {
            prnt.println(1);
        }
        prnt.close();
    }
}