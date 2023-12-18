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
        int totalPrice = 0;
        int totalCount = 0;
        int saleCount = 0;
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            String[] values = line.split(",");
            int price = Integer.parseInt(values[0]);
            int count = Integer.parseInt(values[1]);
            totalPrice += price * count;
            totalCount += count;
            saleCount++;
        }
        out.println(totalPrice);
        out.println((int) ((double) totalCount / saleCount + 0.5));
    }
}