import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());

        int max = Math.max(H, W);

        out.printf("%d\n", (N - 1) / max + 1);
        out.flush();
    }
}
