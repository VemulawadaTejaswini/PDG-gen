import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            int[] A = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int q = partition(A, 0, n - 1);
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i != 0) out.append(" ");

                if (i == q) out.append("[").append(A[i]).append("]");
                else out.append(A[i]);
            }
            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

