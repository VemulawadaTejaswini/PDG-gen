import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        if (B % A == 0) {
            out.printf("%d\n", A + B);
        } else {
            out.printf("%d\n", B - A);
        }
        out.flush();
    }
}
