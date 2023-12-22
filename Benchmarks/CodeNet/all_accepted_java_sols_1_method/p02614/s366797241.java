
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]s = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);

        char[][] mat = new char[h][w];

        for(int i=0;i<h;i++){
            String s2 = br.readLine();
            for (int j = 0; j < w; j++) {
                mat[i][j] = s2.charAt(j);
            }
        }
        int ans = 0;
        for (int maskR = 0; maskR < (1 << h) - 1; maskR++) {
            for (int maskC = 0; maskC < (1 << w) - 1; maskC++) {
                int black = 0;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if ( (((maskR >> i) & 1) == 0) && (((maskC >> j) & 1) == 0) && mat[i][j] == '#'){
                            black += 1;
                        }
                    }
                }
                if (black==k) ans+=1;
            }
        }
        System.out.println(ans);
    }
}
