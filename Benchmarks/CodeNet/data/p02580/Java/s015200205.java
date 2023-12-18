import java.util.*;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    int n = 1;
    int[] dat;
    int default_value = 0;
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
        int H = sc.nextInt(), W = sc.nextInt(), M = sc.nextInt();
        int[] col = new int[W];
        while(n<W) n*=2;
        dat = new int[2*n-1];
        List<Integer>[] rows = new List[H];
        for(int i=0; i<H; i++) rows[i] = new LinkedList<>();
        for(int i=0; i<M; i++){
            int r = sc.nextInt()-1, c = sc.nextInt()-1;
            rows[r].add(c);
            col[c]++;
        }
        for(int j=0; j<W;j++){
            update(j, col[j]);
        }
        int ans = 1;
        for(int i=0; i<H; i++){
            for(int c:rows[i]){
                update(c, -1);
            }
            int maxi = rangeMax(0,0,n-1,0,n-1);
            ans = Math.max(ans, maxi+rows[i].size());
            for(int c:rows[i]){
                update(c, 1);
            }
        }


        return ans;
    }
    void update(int k, int delta_val){
        k += n-1;
        dat[k] += delta_val;
        while(k>0){
            k = (k-1)/2;
            dat[k] = Math.max(dat[k*2+1], dat[k*2+2]);
        }
    }
    int rangeMax(int k, int qstart, int qend, int nstart, int nend){
        if(qstart>nend || qend < nstart) return default_value;
        if(qstart <= nstart && nend <= qend) return dat[k];
        int mid = (nstart+nend)/2;
        int left = rangeMax(k*2+1, qstart, qend, nstart,mid);
        int right = rangeMax(k*2+2, qstart, qend, mid+1, nend);
        return Math.max(left, right);
    }

    int paIn(String s){return Integer.parseInt(s);}
}