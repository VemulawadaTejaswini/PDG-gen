import java.util.*;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    List<Integer>[] tree;
    ArrayList<Integer> ans;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        // int t = sc.nextInt();
        int t= 1;
        while(t-->0){
            out.println(main.solve());
        }
        out.flush();
    }
    long solve() throws Exception{
        int H = sc.nextInt(), W = sc.nextInt(), K = sc.nextInt();
        long[][] rec = new long[H+1][W+1];
        long[][] rowMax = new long[H+1][W+1];
        for(int i=0; i<K; i++){
            int r = sc.nextInt(), c = sc.nextInt(), v = sc.nextInt();
            rec[r][c] = v;
        }
        long[][][] res = new long[H+1][W+1][4];
        for(int i=1; i<=H;i++){
            for(int j=1;j<=W;j++){
                long maxi = 0;
                for(int k=0; k<4;k++) maxi = Math.max(maxi, res[i-1][j][k]);
                res[i][j][0] = maxi;
                for(int k=1; k<4;k++) res[i][j][k] = res[i][j-1][k];
                if(rec[i][j]!=0){
                    // another possibility
                    res[i][j][1] = Math.max(res[i][j][1], res[i][j][0]+rec[i][j]);
                    res[i][j][2] = Math.max(res[i][j][2], res[i][j-1][1]+rec[i][j]);
                    res[i][j][3] = Math.max(res[i][j][3], res[i][j-1][2]+rec[i][j]);
                }
            }
        }
        long ans = 0;
        for(int i=0; i<4;i++) ans = Math.max(ans, res[H][W][i]);
        return ans;
    }
    int paIn(String s){return Integer.parseInt(s);}
}