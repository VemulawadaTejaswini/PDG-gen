import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ACantWaitForHoliday solver = new ACantWaitForHoliday();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACantWaitForHoliday {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s[] = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            String inp = in.next();
            for (int i = 0; i < s.length; i++)
                if (inp.equals(s[i])) {
                    out.println(7 - i);
                }
        }

    }
}

