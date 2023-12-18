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
        String line = null;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            String[] values = line.split(" ");
            int[] orders = new int[10];
            for (int i = 0; i < 4; i++) {
                orders[Integer.parseInt(values[i])] = i + 1;
            }
            values = reader.readLine().split(" ");
            int hit = 0;
            int blow = 0;
            for (int i = 0; i < 4; i++) {
                int order = orders[Integer.parseInt(values[i])];
                if (order == i + 1) {
                    hit++;
                } else if (order != 0) {
                    blow++;
                }
            }
            out.println(hit + " " + blow);
        }
    }
}