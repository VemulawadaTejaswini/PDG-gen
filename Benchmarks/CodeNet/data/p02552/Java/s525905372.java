import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int x = Integer.parseInt(sc.next());
        if (x == 1) {
            out.println(0);
        } else {
            out.println(1);
        }
        sc.close();
        out.close();
    }

}