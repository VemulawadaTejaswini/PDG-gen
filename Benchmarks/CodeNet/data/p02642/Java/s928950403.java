import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
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
        NotDivisible solver = new NotDivisible();
        solver.solve(1, in, out);
        out.close();
    }

    static class NotDivisible {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            Arrays.sort(nums);

            int max = nums[n - 1];

            int[] array = new int[max + 1];
            Arrays.fill(array, 0);

            for (int i = 0; i < n; i++) {
                if (array[nums[i]] == 1) {
                    array[nums[i]] = -1;
                    continue;
                }
                array[nums[i]] = 1;
            }

            for (int i = 0; i < n; i++) {
                int base = nums[i];
                int loop = base + base;
                while (loop <= max) {
                    if (array[loop] == 1) {
                        array[loop] = 0;
                    }
                    loop += base;
                }
            }

            int result = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    result++;
                }
            }
            out.append(String.valueOf(result));
        }

    }
}

