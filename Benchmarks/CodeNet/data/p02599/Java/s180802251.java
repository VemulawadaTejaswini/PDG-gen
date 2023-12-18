import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q = sc.nextInt();
        int[] c = new int[n+1];
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextInt();
        }
        int[][] q = new int[Q][3];
        for (int i = 0; i < Q; i++) {
            q[i][0] = sc.nextInt();
            q[i][1] = sc.nextInt();
            q[i][2] = i;
        }
        Arrays.sort(q, (x,y) -> x[1] - y[1]);
        int[] ans = new int[Q];
        BIT bit = new BIT(n+1);
        int[] idx = new int[n+1];
        int prer = 0;
        for (int i = 0; i < Q; i++) {
            int l = q[i][0], r = q[i][1];
            while(prer < r){
                prer++;
                if(0 < idx[c[prer]]){
                    bit.add(idx[c[prer]], -1);
                }
                bit.add(prer, 1);
                idx[c[prer]] = prer;
            }
            ans[q[i][2]] = bit.sum(r) - bit.sum(l-1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            sb.append(ans[i] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

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
