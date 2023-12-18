import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[1]);

        int ans = 0;
        for(int i = 0; i < 2; i++) {
            if(a > b) {
                ans += a;
                a--;
            }else {
                ans += b;
                b--;
            }
        }

        System.out.println(ans);
    }
}