import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        
        int[] black = new int[n + 1];
        int[] white = new int[n + 1];
        for(int i = 0; i < n; i++) {
            if(s[i] == '#') {
                black[i + 1] = black[i] + 1;
                white[i + 1] = white[i];
            }else {
                black[i + 1] = black[i];
                white[i + 1] = white[i] + 1;
            }
        }

        int ans = 1000000;
        for(int i = 0; i <= n; i++) {
            ans = Math.min(ans, black[i] + white[n] - white[i]);
        }
        System.out.println(ans);

        br.close();
    }
}