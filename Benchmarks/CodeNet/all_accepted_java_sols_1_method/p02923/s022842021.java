import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String[] array = reader.readLine().split(" ");
            long[] H = new long[N];
            for (int i = 0; i < N; i++) {
                H[i] = Long.parseLong(array[i]);
            }

            int ans = 0;

            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                if (H[i] >= H[i + 1]) {
                    count++;
                    if (ans < count) {
                        ans = count;
                    }
                } else {
                    count = 0;
                }
            }

            System.out.println(ans);
        }
    }

}
