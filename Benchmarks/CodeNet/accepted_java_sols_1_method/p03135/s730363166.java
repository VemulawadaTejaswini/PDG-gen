import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int T = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        sc.close();

        double t = (double)T / X;
        out.printf("%.10f\n", t);
        out.flush();
    }
}
