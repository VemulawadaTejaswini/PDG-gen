import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] cnt = new int[3];
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(str[i]);
            if (num % 2 == 0) {
                if (num % 4 == 0) {
                    cnt[2]++;
                } else {
                    cnt[1]++;
                }
            } else {
                cnt[0]++;
            }
        }

        if (cnt[1] > 0) {
            cnt[0]++;
        }

        if (cnt[0] <= cnt[2] + 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
