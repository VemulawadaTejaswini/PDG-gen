import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("0")) {
            int n = Integer.parseInt(line);
            int[] min = new int[n];
            for (int i = 0; i < n; i++) {
                min[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(min);
            int sum = 0;
            for (int i = 0; i <= n - 2; i++) {
                sum += (min[i] * (n - i - 1));
            }
            System.out.println(sum);
        }
    }
}
