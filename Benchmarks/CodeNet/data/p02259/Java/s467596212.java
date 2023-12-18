import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    Scanner sc = new Scanner(System.in);

    void show(final int[] xs) {
        if (xs != null) {
            String out =
                    Arrays.stream(xs)
                            .mapToObj(Integer::toString)
                            .collect(Collectors.joining(" "));
            System.out.println(out);
        }
    }

    void solve() {
        // Input
        int n = sc.nextInt();
        int[] R = new int[n];
        for (int i = 0; i < n; i++) {
            R[i] = sc.nextInt();
        }

        // Solve
        int swapCount = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = n - 1; i >= 1; i--) {
                if (R[i] < R[i - 1]) {
                    int tmp = R[i];
                    R[i] = R[i - 1];
                    R[i - 1] = tmp;
                    swapCount++;
                    flag = true;
                }
            }
        }
        // Output
        show(R);
        System.out.println(swapCount);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}

