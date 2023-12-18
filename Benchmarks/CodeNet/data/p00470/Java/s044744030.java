import java.util.*;

class Main{

    int w, h;
    int[] dx = {1, 0};
    int[] dy = {0, 1};

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt(); h = sc.nextInt();
            if(w==0 && h==0) break;

            int[][][][] dp = new int[w+2][h+2][2][2];
                 
            dp[1][1][1][1] = 1;
            dp[1][1][1][0] = 1;
            for(int x=1; x<=w; x++){
                for(int y=1; y<=h; y++){
                    for(int turn = 0; turn<2; turn++){
                        for(int before=0; before<2; before++){
                            for(int i=0; i<2; i++){
                                int nx = x + dx[i], ny = y + dy[i];
                                if(nx<1 || nx>w || ny<1 || ny>h) continue;
                                if(turn==1 && before!=i) continue;
                                int nturn = 0;
                                if(before!=-1 && before!=i) nturn = 1;
                                dp[nx][ny][nturn][i] += dp[x][y][turn][before];
                                dp[nx][ny][nturn][i] %= 100000;
                            }
                        }
                    }
                }
            }

            int ans = dp[w][h][0][0] + dp[w][h][0][1] + dp[w][h][1][0] + dp[w][h][1][1];
            System.out.println(ans%100000);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}