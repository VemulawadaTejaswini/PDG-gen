import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.valueOf(input[0]);
        int K = Integer.valueOf(input[1]);

        long sum = 0;
        long min = 0;
        for (long i = 0; i < K - 1; i ++) {
            min += i;
        }
        long max = 0;
        for (long i = N; i > N - K + 1; i --) {
            max += i;
        }


        for (long i = K - 1; i < N + 1; i ++) {
            min += i;
            max += N - i;
            sum += (max - min + 1);
        }

        System.out.println(sum % ((long)Math.pow(10, 9) + 7));
    }
}