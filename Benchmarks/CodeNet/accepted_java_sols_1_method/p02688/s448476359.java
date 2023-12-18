import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        boolean[] treated = new boolean[n];
        Arrays.fill(treated, false);
        int cnt = n;
        int d = 0;
        for (int i = 0; i < k; i++) {
            d = Integer.parseInt(br.readLine());
            str = br.readLine().split(" ");
            for (int j = 0; j < d; j++) {
                if (treated[Integer.parseInt(str[j]) - 1] == false) {
                    treated[Integer.parseInt(str[j]) - 1] = true;
                    cnt--;
                }
            }
        }
        System.out.println(cnt);

    }
}
