import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Stack;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        Stack<Integer> stack = new Stack<Integer>();
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            if (n == 0) {
                out.println(stack.pop());
            } else {
                stack.push(n);
            }
        }
    }
}