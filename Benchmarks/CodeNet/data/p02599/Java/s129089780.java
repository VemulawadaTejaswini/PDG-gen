//package f;

import java.io.*;
import java.util.*;

public class Main {
    static FastIO io = new FastIO();
    static int N, Q;
    static int[] C;
    static Qry[] Qs;
    static BIT bt;
    static int[] mxis;

    static void solve(){
        Arrays.sort(Qs, new Comparator<Qry>() {
            @Override
            public int compare(Qry a, Qry b) {
                return a.qr - b.qr;
            }
        });

        bt = new BIT(N + 1);
        mxis = new int[N + 1];
        Arrays.fill(mxis, -1);

        int l = 1;
        for(int i=0; i<Q; i++){
            int r = Qs[i].qr;
            for(int j=l; j<=r; j++){
                int a = C[j];
                int mai = mxis[a];
                if(mai >= 0) {
                    bt.add(mai, -1);
                }
                bt.add(j, 1);
                mxis[a] = j;
            }

            Qs[i].ans = bt.query(Qs[i].ql, Qs[i].qr);
            l = r + 1;
            l = N;
        }

        Arrays.sort(Qs, new Comparator<Qry>() {
            @Override
            public int compare(Qry a, Qry b) {
                return a.idx - b.idx;
            }
        });

        PrintWriter out=new PrintWriter(System.out);
        for(Qry q : Qs){
            out.println(q.ans);
        }
        out.close();
    }


    public static void main() throws Exception {
        N = io.nextInt();  Q = io.nextInt();
        C = new int[N+1];
        for(int i=1; i<=N; i++){
            C[i] = io.nextInt();
        }

        Qs = new Qry[Q];
        for(int i=0; i<Q; i++){
            int l, r;
            l = io.nextInt(); r = io.nextInt();
            Qs[i] = new Qry(l, r, i);
        }

        solve();

    }

    public static void main(String[] args) throws Exception {
        main();
    }

    static class Qry {
        int ql, qr, idx;
        long ans;
        public Qry(int l, int r, int i){
            ql = l; qr = r;
            idx = i;
        }
    }


    static class BIT {
        int n;
        int[] tree;

        public BIT(int n) {
            this.n = n;
            tree = new int[n + 2];
        }

        int sum(int i) {
            i++;
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i;
            }
            return sum;
        }

        void add(int i, int val) {
            i++;
            while (i <= n) {
                tree[i] += val;
                i += i & -i;
            }
        }

        long query(int l, int r){
            long ans = sum(r);
            if(l > 1){
                ans -= sum(l - 1);
            }
            return ans;
        }

        // if the BIT is a freq array, returns the
        // index of the kth item, or n if there are fewer
        // than k items.
        int getKth(int k) {
            int e=Integer.highestOneBit(n), o=0;
            for (; e!=0; e>>=1) {
                if (e+o<=n && tree[e+o]<=k) {
                    k-=tree[e+o];
                    o+=e;
                }
            }
            return o;
        }

    }


    static class FastIO {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();

        }

        public int nextInt(){
            return Integer.parseInt(next());
        }

        public char nextChar(){
            return next().charAt(0);
        }

        public long nextLong(){
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }

        public String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }


    }
}

