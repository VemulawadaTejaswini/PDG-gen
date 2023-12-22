import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB_tmp solver = new TaskB_tmp();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB_tmp {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();

            String substr = new String();
            int maxLen = 0;
            for (int i = 1; i <= str.length(); i++) {
                for (int j = 0; j < str.length() - i + 1; j++) {
                    //strからj~ i文字の部分文字列
                    substr = str.substring(j, j + i);
                    if (isAGCT(substr) && substr.length() > maxLen) {
                        //System.out.println(substr);
                        maxLen = substr.length();
                    }
                }
            }
            out.println(maxLen);
        }

        private boolean isAGCT(String target) {
            for (int i = 0; i < target.length(); i++) {
                //System.out.println(target.charAt(i));
                if (target.charAt(i) != 'A' && target.charAt(i) != 'G' && target.charAt(i) != 'C' && target.charAt(i) != 'T') {
                    return false;
                }
            }
            return true;
        }

    }
}

