import java.util.*;

class FenwickTree{
    private int _n;
    private long[] data;

    public FenwickTree(int n){
        this._n = n;
        data = new long[n];
    }

    public void add(int p, long x){
        assert(0<=p && p<_n);
        p++;
        while(p<=_n){
            data[p-1] += x;
            p += p&-p;
        }
    }
    public long sum(int l, int r){
        assert(0<=l && l<=r && r<=_n);
        return sum(r)-sum(l);
    }

    private long sum(int r){
        long s = 0;
        while(r>0){
            s += data[r-1];
            r -= r&-r;
        }
        return s;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();
        FenwickTree fw = new FenwickTree(N);
        for(int n=0; n<N; n++){
            long a = sc.nextLong();
            fw.add(n, a);
        }
        for(int q=0; q<Q; q++){
            int t = sc.nextInt();
            if(t==0){
                int p = sc.nextInt();
                long x = sc.nextLong();
                fw.add(p, x);
            }else{
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(fw.sum(l, r));
            }
        }
        
        
    }
}
