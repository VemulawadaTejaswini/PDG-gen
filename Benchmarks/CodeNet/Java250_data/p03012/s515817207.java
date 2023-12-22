import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] ws = new int[n + 1];
        int sum = 0;
        ws[0] = 0;
        for (int i = 1; i <= n; i++) {
            int w = in.nextInt();
            sum += w;
            ws[i] = w + ws[i - 1];
        }

        int ans = 1 << 29;
        for (int i = 1; i < n; i++) {
            ans = Math.min(ans, Math.abs((sum - ws[i]) - ws[i]));
        }

        out.println(ans);
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());
    }

    @Override
    public void close() {
        this.sc.close();
    }
}
