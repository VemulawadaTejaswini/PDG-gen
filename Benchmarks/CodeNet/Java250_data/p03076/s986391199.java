import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(in.nextInt());
        list.add(in.nextInt());
        list.add(in.nextInt());
        list.add(in.nextInt());
        list.add(in.nextInt());

        ArrayList<Integer> nextTImeList = new ArrayList<>();
        for (Integer i : list) {
            nextTImeList.add((i % 10 == 0) ? i : i - (i % 10) + 10);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += (i == j) ? list.get(j) : nextTImeList.get(j);
            }

            min = Math.min(min, sum);
        }

        out.println(min);
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
