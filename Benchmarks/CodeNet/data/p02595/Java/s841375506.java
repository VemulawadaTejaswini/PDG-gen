import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        long[][] xy = new long[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                xy[i][j] = scan.nextInt();
            }
        }
        int out = 0;
        for(int i = 0; i < n; i++){
            if(Math.sqrt(xy[i][0] * xy[i][0] + xy[i][1] * xy[i][1]) <= d) out++;
        }
        System.out.println(out);
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
