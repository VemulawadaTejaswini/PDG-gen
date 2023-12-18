import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());

            int max1 = 0, max2 = 0;

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(reader.readLine());

                if (A[i] > max2) {
                    max2 = A[i];
                }
                if (A[i] > max1) {
                    max2 = max1;
                    max1 = A[i];
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (A[i] != max1) {
                    sb.append(max1);
                } else {
                    sb.append(max2);
                }
                sb.append("\n");
            }

            System.out.println(sb.toString());
        }
    }

}
