import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        while(true) {
            int m = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            if (m == -1 && f == -1 && r == -1) {
                break;
            }
            if (m == -1 || f == -1) {
                out.printf("F\n");
            } else if (m + f >= 80) {
                out.printf("A\n");
            } else if (m + f >= 65) {
                out.printf("B\n");
            } else if (m + f >= 50) {
                out.printf("C\n");
            } else if (m + f >= 30) {
                if (r >= 50) {
                    out.printf("C\n");
                } else {
                    out.printf("D\n");
                }
            } else {
                out.printf("F\n");
            }
        }
        out.flush();
    }
}
