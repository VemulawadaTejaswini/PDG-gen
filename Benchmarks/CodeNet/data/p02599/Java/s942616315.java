import java.io.*;
import java.util.*;

public class Main{
    static PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    static Scanner sc = new Scanner(System.in);
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
    void solve(){
        int n = sc.nextInt(), q = sc.nextInt();
        int[] color = new int[n+1];
        for(int i=1; i<=n; i++) color[i] = sc.nextInt();
        int[] bit = new int[n+1];
        int[][] qlr = new int[q][];
        for(int i=0; i<q; i++){
            qlr[i] = new int[]{i, sc.nextInt(), sc.nextInt()};
        }
        Arrays.sort(qlr, Comparator.comparingInt(o1->o1[2])); // ascending order or r[i]
        int now = 1;
        int[] last = new int[n+1];
        int[] ans = new int[q];
        for(int i=0; i<q; i++){
            int[] cur = qlr[i];
            while(now<=cur[2]){
                int c = color[now];
                if(last[c]>0){
                    addTo(last[c], -1, n, bit);
                }
                last[c] = now;
                addTo(now, 1, n, bit);
                now++;
            }
            int l = cur[1], r = cur[2];
            int temp = sum(r, n, bit)-sum(l-1, n, bit);
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
}

