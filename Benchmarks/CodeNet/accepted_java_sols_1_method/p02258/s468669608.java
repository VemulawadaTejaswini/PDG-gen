import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int prospectMin = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (i == 0) {
                prospectMin = a;
                continue;
            }
            int profit = a - prospectMin;
            if (profit > max) {
                max = profit;
            }
            if (a < prospectMin) {
                prospectMin = a;
            }
        }
        System.out.println(max);

    }
}