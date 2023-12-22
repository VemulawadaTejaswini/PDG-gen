import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            

            int[] array = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};

            Arrays.parallelSort(array);    // 5 5 7 になっていれば正解

            out.append(Arrays.equals(array, new int[]{5, 5, 7}) ? "YES" : "NO");


        }

    }
}

