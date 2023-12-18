import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());

        int times = (2 * T + 1) / (2 * A);
        int num = B * times;
        out.printf("%d\n", num);
        out.flush();
    }
}
