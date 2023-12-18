import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int Q = Integer.parseInt(s[1]);
        String sc[] = br.readLine().split(" ");
        int[] c = new int[n+1];
        for (int i = 1; i <= n; i++) {
            c[i] = Integer.parseInt(sc[i-1]);
        }
        int[][] q = new int[Q][3];
        for (int i = 0; i < Q; i++) {
            String[] sq = br.readLine().split(" ");
            q[i][0] = Integer.parseInt(sq[0]);
            q[i][1] = Integer.parseInt(sq[1]);
            q[i][2] = i;
        }
        Arrays.sort(q, (x,y) -> x[1] - y[1]);
        int[] ans = new int[Q];
        BIT bit = new BIT(n+1);
        int[] idx = new int[n+1];
        int prer = 0;
        int sum = 0;
        for (int i = 0; i < Q; i++) {
            int l = q[i][0], r = q[i][1];
            while(prer < r){
                prer++;
                if(0 < idx[c[prer]]){
                    bit.add(idx[c[prer]], -1);
                }else{
                    sum++;
                }
                bit.add(prer, 1);
                idx[c[prer]] = prer;
            }
            ans[q[i][2]] = sum - bit.sum(l-1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            sb.append(ans[i] + "\n");
        }
        System.out.print(sb.toString());

    }

}

class BIT {

    public int n;
    public int[] bit;

    public BIT(int n){
        this.n = n;
        bit = new int[n+1];
    }

    public int sum(int i){
        int s = 0;
        while(0 < i){
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }

    public void add(int i, int x){
        while(i <= n){
            bit[i] += x;
            i += i & -i;
        }
    }

    public int lowerBound(int k){
        if(k <= 0) return 0;
        int x = 0;
        int max = 1;
        while(max < n) max *= 2;
        for (int i = max; i > 0; i /= 2) {
            if(x + i <= n && bit[x + i] < k){
                k -= bit[x + i];
                x += i;
            }
        }
        return x + 1;
    }

}
