import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            args = reader.readLine().split(" ");
            int[] L = new int[N];
            for (int i = 0; i < N; i++) {
                L[i] = Integer.parseInt(args[i]);
            }

            Arrays.sort(L);

            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        if (L[k] >= L[i] + L[j]) {
                            break;
                        }

                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

}
