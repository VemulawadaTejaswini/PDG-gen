import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        int[][] dp = new int[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        dp[0][0] = map[0][0] == '#' ? 1 : 0;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                int ic = 1000000;
                int jc = 1000000;
                if(i == 0 && j == 0){
                    continue;
                }
                if(i > 0){
                    ic = dp[i-1][j];
                    if(map[i-1][j] == '.' && map[i][j] == '#'){
                        ic++;
                    }
                }
                if(j > 0){
                    jc = dp[i][j-1];
                    if(map[i][j-1] == '.' && map[i][j] == '#'){
                        jc++;
                    }
                }
                dp[i][j] = Math.min(ic,jc);
            }
        }
        /*
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        */
        System.out.println(dp[h-1][w-1]);
    }
}
