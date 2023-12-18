import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BrokenCipherGenerator solver = new BrokenCipherGenerator();
        solver.solve(1, in, out);
        out.close();
    }

    static class BrokenCipherGenerator {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String token = in.next();
            while (!".".equals(token)) {
                out.println(decrypt(token).toString());
                token = in.next();
            }
        }

        private static StringBuilder decrypt(String str) {
            StringBuilder plain = new StringBuilder();
            int n = str.length();
            int offset = 0, depth = 0, open = -1;
            for (int i = 0; i < n; i++) {
                switch (str.charAt(i)) {
                    case '+': {
                        if (depth == 0) offset++;
                        break;
                    }
                    case '-': {
                        if (depth == 0) offset--;
                        break;
                    }
                    case '[': {
                        if (depth == 0) open = i;
                        depth++;
                        break;
                    }
                    case ']': {
                        depth--;
                        if (depth == 0) plain.append(decrypt(str.substring(open + 1, i)).reverse());
                        break;
                    }
                    case '?': {
                        if (depth == 0) {
                            plain.append('A');
                            offset = 0;
                        }
                        break;
                    }
                    default: {
                        if (depth == 0) {
                            char c = (char) ((str.charAt(i) - 'A' + offset + 78) % 26 + 'A');
                            // System.out.println("APPENDING " + c + " WITH OFFSET " + offset);
                            plain.append(c);
                            offset = 0;
                        }
                        break;
                    }
                }
            }
            return plain;
        }

    }
}


