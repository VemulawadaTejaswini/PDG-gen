import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String g = in.next();
        while (!"#".equals(g)) {
            int y = in.nextInt(), m = in.nextInt(), d = in.nextInt();
            if (y <= 30 || (y == 31 && m <= 4)) {
                out.print("HEISEI ");
            } else {
                out.print("? ");
                y -= 30;
            }
            out.println(y + " " + m + " " + d);

            g = in.next();
        }
        out.flush();
    }
}

