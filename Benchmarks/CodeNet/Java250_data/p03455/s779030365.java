import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        if (a % 2 == 1 && b % 2 == 1) {
            out.printf("Odd\n");
        } else {
            out.printf("Even\n");
        }
        out.flush();
    }
}