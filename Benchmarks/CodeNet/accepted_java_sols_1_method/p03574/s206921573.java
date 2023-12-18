import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] hw = br.readLine().split(" ");
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        char[][] masu = new char[h+2][w+2];
        
        
        for (int i = 0; i < h; i++) {
            String raw = br.readLine();
            for (int j = 0; j < w; j++) {
                masu[i+1][j+1] = raw.charAt(j);
            }
        }
        
        /*for (int i = 0; i < h; i++) {
            String raw = br.readLine();
            for (int j = 0; j < w; j++) {
                System.out.print(masu[i+1][j+1]);
            }
            System.out.println("");
        }*/
        
        int count = 0;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (masu[i][j] == '#') {
                    System.out.print('#');
                    continue;
                }
                
                if (masu[i-1][j-1] == '#') count++;
                if (masu[i-1][j] == '#') count++;
                if (masu[i-1][j+1] == '#') count++;
                if (masu[i][j-1] == '#') count++;
                if (masu[i][j+1] == '#') count++;
                if (masu[i+1][j-1] == '#') count++;
                if (masu[i+1][j] == '#') count++;
                if (masu[i+1][j+1] == '#') count++;
                
                System.out.print(count);
                count = 0;
            }
            System.out.print("\n");
        }
    }
}
