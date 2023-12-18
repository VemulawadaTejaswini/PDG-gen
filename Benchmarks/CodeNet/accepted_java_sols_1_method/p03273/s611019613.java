import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] hw = br.readLine().split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        char[][] grid = new char[h][w];
        
        for (int i = 0; i < h; i++) {
            String raw = br.readLine();
            for (int j = 0; j < w; j++) {
                grid[i][j] = raw.charAt(j);
            }
        }
        
        //boolean tate = true;
        //boolean yoko = true;
        int h2 = h;
        int w2 = w;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean tate = true;
                boolean yoko = true;
                if (grid[i][j] == '.') {
                    for (int k = 0; k < w; k++) {
                        if (grid[i][k] == '#') {
                            yoko = false;
                            break;
                        }
                    }
                    for (int l = 0; l < h; l++) {
                        if (grid[l][j] == '#') {
                            tate = false;
                            break;
                        }
                    }
                    if (yoko) {
                        for (int m = 0; m < w; m++) {
                            grid[i][m] = 'P';
                            
                        }
                        h2--;
                    }
                    if (tate) {
                        for (int n = 0; n < h; n++) {
                            grid[n][j] = 'P';
                            
                        }
                        w2--;
                    }
                }
            }
        }
        
        boolean passed = false;
        char[] ans = new char[h2*w2];
        int memo = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == '.' || grid[i][j] == '#') {
                    ans[memo] = grid[i][j];
                    memo++;
                }
            }
        }
        
        int now = 0;
        for (int i = 0; i < h2*w2; i++) {
            System.out.print(ans[i]);
            
            if (now + 1 == w2) {
                System.out.print('\n');
                now = 0;
                continue;
            }
            now++;
        }
        //System.out.println(h2);
        
    }
}
