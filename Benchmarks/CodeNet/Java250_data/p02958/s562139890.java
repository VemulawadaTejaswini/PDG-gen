import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            //List<Integer> list = new ArrayList<>();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = in.nextInt();
            }
            //List<Integer> answerList = list.stream().sorted().collect(Collectors.toList());
            int[] answerArray = Arrays.stream(array).sorted().toArray();
            int[] swapArray = Arrays.copyOf(array, N);

            if (Arrays.equals(answerArray, swapArray)) {
                out.println("YES");
                return;
            }

            for (int i = 0; i < N; i++) {
                int tmpNum = array[i];
                for (int j = i + 1; j < N; j++) {
                    swapArray[i] = swapArray[j];
                    swapArray[j] = tmpNum;
                    if (Arrays.equals(answerArray, swapArray)) {
                        out.println("YES");
                        return;
                    }
                    swapArray[j] = swapArray[i];
                    swapArray[i] = tmpNum;
                }
            }
            //System.out.println("NO");
            out.println("NO");
        }

    }
}

