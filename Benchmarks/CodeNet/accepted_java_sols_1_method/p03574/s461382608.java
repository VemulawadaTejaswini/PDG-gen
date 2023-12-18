import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int w = sc.nextInt();
        char[][] hw = new char[n][w];
        for (int i = 0; i < n; i++) {
            hw[i] = sc.next().toCharArray();

        }
        int[] dx = {1,0,-1,0,1,-1,-1,1};
        int[] dy = {0,1,0,-1,1,1,-1,-1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++) {
                if (hw[i][j] == '#') continue;
                int num = 0;
                for(int k = 0; k < 8 ; k++) {

                    int ni = i + dx[k];
                    int nj = j + dy[k];
                    if (ni < 0 || n <= ni) continue;
                    if (nj < 0 || w <= nj) continue;
                    if(hw[ni][nj] == '#') num++;
                }

                hw[i][j] = (char)(num + '0');

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(hw[i][j]);
            }
            System.out.println();
        }
    }
}