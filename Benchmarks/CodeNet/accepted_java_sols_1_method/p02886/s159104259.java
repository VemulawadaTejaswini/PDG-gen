import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            args = reader.readLine().split(" ");
            int[] D = new int[N];
            for (int i = 0; i < N; i++) {
                D[i] = Integer.parseInt(args[i]);
            }

            long sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    sum += D[i] * D[j];
                }
            }

            System.out.println(sum);
        }
    }

}
