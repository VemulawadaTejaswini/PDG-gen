import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = Integer.parseInt(scanner.next());
        var A = new int[N];
        var A_max = 0;
        for (int i = 0; i < N; ++i) {
            A[i] = Integer.parseInt(scanner.next());
            if (A_max < A[i]) A_max = A[i];
        }
        Arrays.parallelSort(A);
        var isP = new boolean[A_max + 1];
        var checked = new boolean[A_max + 1];
        for (int i = 0; i <= A_max; ++i) {
            isP[i] = true;
            checked[i] = false;
        }
        for (int i = 0; i < N; ++i) {
            if (checked[A[i]]) {
                isP[A[i]] = false;
                continue;
            }
            checked[A[i]] = true;
            for (int mul = A[i] * 2; mul <= A_max; mul += A[i])
                isP[mul] = false;
        }
        int numP = 0;
        for (int i = 0; i < N; ++i) if (isP[A[i]]) ++numP;
        System.out.println(numP);
    }
}
