import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        String s = sc.next();
        int slength = s.length();
        char c = s.charAt(slength - 1);
        if (c == 's') {
            out.println(s + "es");
        } else {
            out.println(s + "s");
        }
        sc.close();
        out.close();
    }

}