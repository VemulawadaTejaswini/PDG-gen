import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        int ans = a - 1;
        if (a <= b) {
            ans++;
        }
        out.printf("%d\n", ans);
        out.flush();
    }
}
