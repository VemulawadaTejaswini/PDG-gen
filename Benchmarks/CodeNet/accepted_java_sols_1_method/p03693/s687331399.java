import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int calc = r * 100 + g * 10 + b;
        if (calc % 4 == 0) {
            out.printf("YES\n");
        } else {
            out.printf("NO\n");
        }
        out.flush();
    }
}