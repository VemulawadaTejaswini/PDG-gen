import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());

            String[] array = reader.readLine().split(" ");
            int[] A = new int[N + 1];
            for (int i = 0; i < N + 1; i++) {
                A[i] = Integer.parseInt(array[i]);
            }

            array = reader.readLine().split(" ");
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(array[i]);
            }

            long ans = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] >= B[i]) {
                    ans += B[i];
                } else {
                    ans += A[i];
                    if (A[i + 1] >= (B[i] - A[i])) {
                        ans += B[i] - A[i];
                        A[i + 1] -= B[i] - A[i];
                    } else {
                        ans += A[i + 1];
                        A[i + 1] = 0;
                    }
                }
            }

            System.out.println(ans);
        }
    }

}
