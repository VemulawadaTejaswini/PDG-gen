import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int result = 0;
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isDigit(ch)) {
                    int m = ch - '0';
                    for (i = i + 1; i < line.length(); i++) {
                        ch = line.charAt(i);
                        if (!Character.isDigit(ch)) {
                            break;
                        }
                        m *= 10;
                        m += ch - '0';
                    }
                    result += m;
                }
            }
        }
        out.println(result);
    }
}