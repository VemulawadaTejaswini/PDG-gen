import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        sc.close();

        out.printf("%d\n", X + (Y / 2));
        out.flush();
    }
}
