import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int binarySearch(int x, int[] arr) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return arr[mid];
            } else if (x < arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
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
            int[] S = new int[n];
            for (int i = 0; i < n; i++) {
                S[i] = Integer.parseInt(line[i]);
            }

            int q = Integer.parseInt(in.readLine());
            line = in.readLine().split(" ");
            int C = 0;
            for (int i = 0; i < q; i++) {
                int t = Integer.parseInt(line[i]);
                int ret = binarySearch(t, S);
                if (ret != Integer.MIN_VALUE) C++;
            }

            System.out.println(C);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
