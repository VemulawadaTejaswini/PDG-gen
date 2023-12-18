import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int h = Integer.parseInt(line[0]);
        int w = Integer.parseInt(line[1]);
        char[][] picture = new char[h+2][w+2];
        
        for (int i = 1; i <= h; i++) {
            String row = br.readLine();
            for (int j = 1; j <= w; j++) {
                picture[i][j] = row.charAt(j-1);
            }
        }
        
        String ans = "Yes";
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (picture[i][j] == '#') {
                    if (picture[i][j-1] != '#' && picture[i][j+1] != '#' && picture[i-1][j] != '#' && picture[i+1][j] != '#') {
                        ans = "No";
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
