import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String a, b;

        a = sc.next();
        b = sc.next();

        if (a.equals("H")) {
            if (b.equals("H")) {
                out.println("H");
            }
            if (b.equals("D")) {
                out.println("D");
            }
        }
        if (a.equals("D")) {
            if (b.equals("H")) {
                out.println("D");
            }
            if (b.equals("D")) {
                out.println("H");
            }
        }

        sc.close();

    }
}