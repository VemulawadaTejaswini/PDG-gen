import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // num of luggage
    static int n;
    // num of truck
    static int k;
    // luggage
    static int[] w;

    static int countLuggage(int p) {
        int cnt = 0;
        for (int j = 0; j < k; j++) {
            int sum = 0;
            while (sum + w[cnt] <= p) {
                sum += w[cnt];
                cnt++;
                if (cnt == n) return n;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = in.readLine().split(" ");
            n = Integer.parseInt(line[0]);
            k = Integer.parseInt(line[1]);
            w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = Integer.parseInt(in.readLine());
            }

            int left = 0;
            int right = 100000 * 10000;
            int mid = 0;
            while (left < right) {
                mid = (left + right) / 2;
                int nLuggage = countLuggage(mid);
                if (nLuggage >= n) right = mid;
                else left = mid + 1;
            }

            System.out.println(right);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

