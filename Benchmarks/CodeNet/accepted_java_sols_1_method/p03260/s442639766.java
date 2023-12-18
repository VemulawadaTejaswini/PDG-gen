import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        if (A % 2 == 0 || B % 2 == 0) {
            out.printf("No\n");
        } else {
            out.printf("Yes\n");
        }
        out.flush();
    }
}
