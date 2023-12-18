import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        sc.close();

        int remain = (H - h) * (W - w);
        out.printf("%d\n", remain);
        out.flush();
    }
}
