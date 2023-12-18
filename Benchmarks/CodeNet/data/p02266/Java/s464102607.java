import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final char[] line = reader.readLine().toCharArray();
        reader.close();

        final Deque<Integer> stack = new ArrayDeque<Integer>(line.length);
        final StringBuilder answer = new StringBuilder();

        int sum = 0;
        int count = 0;
        int indexLastZero = 0;
        final int[] process = new int[line.length];
        final int[] graph = new int[line.length];
        for (int i = 0; i < line.length; ++i) {
            if (stack.isEmpty()) indexLastZero = i;

            switch (line[i]) {
                case '\\':
                    stack.push(i);
                    break;
                case '/':
                    if (!stack.isEmpty()) {
                        sum += i - stack.pop();
                        if (stack.isEmpty()) {
                            ++count;
                            answer.append(" ").append(sum - process[indexLastZero]);
                        }
                    }
                    break;
                default:
            }
            graph[i] = stack.size();
            process[i] = sum;
        }

        for (int i = indexLastZero + 1; i < line.length; ++i) {
            for (int j = line.length - 1; i < j; --j) {
                if (graph[i] == graph[j]) {
                    ++count;
                    answer.append(" ").append(process[j] - process[i]);
                    i = j;
                    break;
                }
            }
        }
        for (int i = indexLastZero; i < line.length; ++i) {
            System.out.printf("%3d, %3d\n", graph[i], process[i]);
        }

        System.out.println(sum);
        System.out.println(count + answer.toString());
    }
}