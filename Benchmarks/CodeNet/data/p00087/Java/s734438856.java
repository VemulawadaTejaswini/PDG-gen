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
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] tokens = line.split(" ");
            Stack<Double> stack = new Stack<Double>();
            for (String token : tokens) {
                try {
                    double number = Double.parseDouble(token);
                    stack.push(number);
                    continue;
                } catch (NumberFormatException e) {
                    /* nothing */
                }
                double b = stack.pop();
                double a = stack.pop();
                double c = 0.0;
                if (token.equals("+")) {
                    c = a + b;
                } else if (token.equals("-")) {
                    c = a - b;
                } else if (token.equals("*")) {
                    c = a * b;
                } else if (token.equals("/")) {
                    c = a / b;
                }
                stack.push(c);
            }
            double result = stack.pop();
            out.println(String.format("%.6f", result));
        }
    }
}