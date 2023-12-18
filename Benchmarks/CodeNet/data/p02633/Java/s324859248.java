import java.io.*;

/**
 * Created by Ayushi on 20 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = n;
        int ans = -1;
        for(int i = 1; true; i++) {
            if (a % 360 == 0) {
                ans = i;
                break;
            }
            else {
                a += n;
            }
        }
        System.out.println(ans);
        br.close();
    }
}
