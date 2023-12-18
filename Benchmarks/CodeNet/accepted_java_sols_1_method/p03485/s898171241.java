import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = (a + b + 1) / 2;
        out.printf("%d\n", x);
        out.flush();
    }
}