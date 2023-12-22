import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int person = Integer.parseInt(n);
        long[] hi = new long[person];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < person; i++) {
            hi[i] = Long.parseLong(str[i]);
        }

        long sum = 0;
        for (int i = 1; i < person; i++) {
            if (hi[i - 1] > hi[i]) {
                long diff = (hi[i - 1] - hi[i]);
                sum += diff;
                hi[i] += diff;
            }
        }
        System.out.println(sum);
    }
}
