import java.util.*;
import java.util.stream.Collectors;

public class Main {

    Scanner sc = new Scanner(System.in);

    void show(final int[] xs) {
        if(xs != null) {
            String out = 
                Arrays.stream(xs)
                    .mapToObj(Integer::toString)
                    .collect(Collectors.joining(" "));
            System.out.println(out);
        }        
    }

    void solve() {
        // Input
        final int N = sc.nextInt();
        final int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        show(A);

        // Solve
        for(int i = 1; i < N; i++) {
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;
            show(A);
        }

    }

    public static void main(final String[] args) {
        new Main().solve();
    }
}

