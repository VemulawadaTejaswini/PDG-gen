import java.io.*;
import java.util.*;

public class Main{
    static PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
        int t= 1;
        while(t-->0){
            main.solve();
        }
//        main.solve();
        out.flush();
    }
    void solve() throws Exception{
        //
        String[] buf = reader.readLine().split(" ");
        int n = parIn(buf[0]), q = parIn(buf[1]);
        int[] color = new int[n+1];
        buf = reader.readLine().split(" ");
        for(int i=1; i<=n; i++) color[i] = parIn(buf[i-1]);
        int[] bit = new int[n+1];
        int[][] qlr = new int[q][];

        for(int i=0; i<q; i++){
            buf = reader.readLine().split(" ");
            qlr[i] = new int[]{i, parIn(buf[0]), parIn(buf[1])};
        }
        Arrays.sort(qlr, Comparator.comparingInt(o1->o1[2])); // ascending order or r[i]
        int now = 1;
        int[] last = new int[n+1];
        int[] ans = new int[q];
        boolean[] seen = new boolean[n+1];
        int total = 0;
        for(int i=0; i<q; i++){
            int[] cur = qlr[i];
            while(now<=cur[2]){
                int c = color[now];
                if(!seen[c]) {
                    total += 1;
                    seen[c] = true;
                }
                if(last[c]>0){
                    addTo(last[c], -1, n, bit);
                }
                last[c] = now;
                addTo(now, 1, n, bit);
                now++;
            }
            int l = cur[1], r = cur[2];
            int temp = total-sum(l-1, n, bit);
            ans[cur[0]] = temp;
        }
        for(int i=0; i<q; i++) out.println(ans[i]);
    }
    void addTo(int idx, int val, int n, int[] bit){
        while(idx<=n){
            bit[idx] += val;
            idx += idx&(-idx);
        }
    }
    int sum(int idx, int n, int[] bit){
        int ans= 0;
        while(idx>0){
            ans += bit[idx];
            idx -= idx&(-idx);
        }
        return ans;
    }
    int parIn(String s){return Integer.parseInt(s);}
}

