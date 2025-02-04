import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int w = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int n = Integer.parseInt(str[2]);

        int[][] map = new int[h][w];
        for(int i=0; i<h; i++) Arrays.fill(map[i], 0);

        for(int i=0; i<n; i++){
            str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int a = Integer.parseInt(str[2]);
            switch (a){
                case 1:
                    map[h-1][0]++;
                    if(x==w) break;
                    map[h-1][x]--;
                    break;
                case 2:
                    if(x==w) break;
                    map[h-1][x]++;
                    break;
                case 3:
                    if(y==0) break;
                    map[y-1][0]++;
                    break;
                case 4:
                    map[h-1][0]++;
                    if(y==0) break;
                    map[y-1][0]--;
                    break;
            }
        }

        for(int i=0; i<h; i++){
            for(int j=1; j<w; j++){
                map[i][j] += map[i][j-1];
            }
        }

        for(int i=h-2; i>=0; i--){
            for(int j=0; j<w; j++){
                map[i][j] += map[i+1][j];
            }
        }

        int cnt = 0;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(map[i][j] <= 0) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
