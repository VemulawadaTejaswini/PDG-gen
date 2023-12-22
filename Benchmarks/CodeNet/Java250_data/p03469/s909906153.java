import java.io.*;

public class Main {

    public static void main(String[] args) {
	    InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        TaskA solver = new TaskA();
        solver.solve(in, out);

        out.close();
    }

    static class TaskA {
        public void solve(InputReader in, PrintWriter out) {
            String date = in.next();
            out.println(date.replace("2017","2018"));
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public String[] input;
        public int current;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            input = null;
            current = 0;
        }

        public String next() {
            while (input == null || current == input.length) {
                try {
                    current = 0;
                    input = reader.readLine().split("\\s");
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }

            return input[current++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}