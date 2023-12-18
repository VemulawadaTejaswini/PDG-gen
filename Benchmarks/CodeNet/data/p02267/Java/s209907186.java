import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int linearSearch(int x, int[] arr) {
        int i = 0;
        while (arr[i] != Integer.MIN_VALUE) {
            if (arr[i] == x) return arr[i];
            i++;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            if (n <= 0) {
                System.out.println(0);
                System.exit(0);
            }

            String[] line = in.readLine().split(" ");
            int[] S = new int[n + 1];
            S[n] = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                S[i] = Integer.parseInt(line[i]);
            }

            int q = Integer.parseInt(in.readLine());
            line = in.readLine().split(" ");
            int C = 0;
            for (int i = 0; i < q; i++) {
                int t = Integer.parseInt(line[i]);
                int ret = linearSearch(t, S);
                if (ret != Integer.MIN_VALUE) C++;
            }

            System.out.println(C);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
