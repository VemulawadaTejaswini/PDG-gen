import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] X = new int[N];
        int minSum = 2000000;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(X);

        for (int i = X[0]; i <= X[N - 1]; i++) {
            for (int j = 0; j < N; j++) {
                sum += (X[j] - i) * (X[j] - i);
            }

            if (sum < minSum) {
                minSum = sum;
            }
            sum = 0;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(minSum);
        sc.close();
        out.flush();
    }
}