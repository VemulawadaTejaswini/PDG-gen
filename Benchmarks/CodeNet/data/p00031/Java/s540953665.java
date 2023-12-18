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
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            int w = Integer.parseInt(line);
            boolean sp = false;
            for (int i = 1; i <= 512; i <<= 1) {
                if ((w & i) == i) {
                    if (!sp) {
                        sp = true;
                    } else {
                        out.print(' ');
                    }
                    out.print(i);
                }
            }
            out.println();
        }
    }
}