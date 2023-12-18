import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int person = Integer.parseInt(n);
        int[] hi = new int[person];
        int diff, sum = 0;
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < person; i++) {
            hi[i] = Integer.parseInt(str[i]);
        }

        for (int i = 1; i < person; i++) {
            if (hi[i - 1] > hi[i]) {
                diff = (hi[i - 1] - hi[i]);
                sum += diff;
                hi[i] += diff;
            }
        }
        System.out.println(sum);
    }
}
