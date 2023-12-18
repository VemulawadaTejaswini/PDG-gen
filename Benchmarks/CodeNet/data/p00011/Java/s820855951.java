import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int w = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[w];
        for (int i = 0; i < w; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            String[] values = reader.readLine().split(",");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int tmp = numbers[a - 1];
            numbers[a - 1] = numbers[b - 1];
            numbers[b - 1] = tmp;
        }
        for (int i = 0; i < w; i++) {
            out.println(numbers[i]);
        }
    }
}