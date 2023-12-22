import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        sc.close();

        if (N <= 999) {
            out.printf("ABC\n");
        } else {
            out.printf("ABD\n");
        }
        out.flush();
    }
}
