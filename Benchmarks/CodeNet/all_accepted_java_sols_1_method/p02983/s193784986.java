import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        sc.close();

        long min = 2019;
        for (int i = L; i <= R - 1; i++) {
            for (int j = i + 1; j <= R; j++) {
                long calc = ((long)i * j) % 2019;
                if (calc < min) {
                    min = calc;
                }
                if (min == 0) {
                    break;
                }
            }
            if (min == 0) {
                break;
            }
        }
        out.printf("%d\n", min);
        out.flush();
    }
}
