//package f;

import java.io.*;
import java.util.*;

public class Main {
    FastIO io = new FastIO("in.txt");
    int N, Q;
    int[] C;
    int[] mxis;
    Qry[] Qs;

    void solve(){
        //Node[] nodes = new Node[N];
        //Node sgt = new Node(0, N-1, null, nodes);
        BIT bt = new BIT(N);

        shuffle(Qs);
        Arrays.sort(Qs, new Comparator<Qry>() {
            @Override
            public int compare(Qry a, Qry b) {
                return a.qr - b.qr;
            }
        });

        mxis = new int[1000005];
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
        }

        shuffle(Qs);
        Arrays.sort(Qs, new Comparator<Qry>() {
            @Override
            public int compare(Qry a, Qry b) {
                return a.idx - b.idx;
            }
        });

        for(Qry q : Qs){
            io.out(q.ans + "\n");
        }
    }


    public void main() throws Exception {
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
        Main task = new Main();
        task.main();
    }

    class Qry {
        int ql, qr, idx;
        long ans;
        public Qry(int l, int r, int i){
            ql = l; qr = r;
            idx = i;
        }
    }

    class Node {
        int l, r;
        long v;
        Node leftNode, rightNode, parNode;
        public Node(int l, int r, Node par, Node[] nodes){
            this.l = l; this.r = r; this.parNode = par;
            this.v = 0;
            if(l == r){
                nodes[(int)l] = this;
                return;
            }

            int m = l + (r-l)/2;
            this.leftNode = new Node(l, m, this, nodes);
            this.rightNode = new Node(m+1, r, this, nodes);
        }

        public void add(long a){
            this.v += a;
            if(this.parNode != null){
                this.parNode.add(a);
            }
        }

        public long sum(int ql, int qr){
            //io.out(ql + " " + qr + " " + l + " " + r + "\n");
            if(ql == l && qr == r) return v;
            int m = l + (r - l) / 2;
            if(qr <= m) return leftNode.sum(ql, qr);
            if(ql > m) return rightNode.sum(ql, qr);
            return leftNode.sum(ql, m) + rightNode.sum(m+1, qr);
        }
    }

    public static void shuffle(Object[] as){
        Random rnd = new Random();
        for(int i=0; i<as.length; i++){
            int j =rnd.nextInt(as.length);
            Object t = as[i];
            as[i] = as[j];
            as[j] = t;
        }
    }

    //index from 1
    class BIT {
        long[] C;
        int N;
        public BIT(int n){
            C = new long[n + 1];
            N = n;
        }

        int lowbit(int a){
            return ((a ^ (a - 1)) + 1) >> 1;
        }

        void add(int idx, int a){
            if(idx > N){
                return;
            }

            C[idx] += a;
            //io.out(idx + " " + lowbit(idx) + "\n");
            add(idx + lowbit(idx), a);
        }

        long sum(int idx){
            if(idx <= 0) return 0;
            return sum(idx - lowbit(idx)) + C[idx];
        }

        long query(int l, int r){
            long ans = sum(r);
            if(l > 1){
                ans -= sum(l - 1);
            }
            return ans;
        }
    }

    class FastIO {
        BufferedReader br;
        StringTokenizer sk;
        PrintWriter pw = new PrintWriter(System.out);

        public FastIO(String fname){
            try{
                File f = new File(fname);
                if(f.exists()) {
                    System.setIn(new FileInputStream(fname));
                }

            }catch (Exception e){
                throw new IllegalArgumentException(e);
            }

            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastIO(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(sk==null || !sk.hasMoreElements()){
                try {
                    sk = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new IllegalArgumentException(e);
                }
            }
            return sk.nextToken();
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

        public void out(String v){
            pw.print(v);
        }

        public void out(int v) {
            pw.print(v);
        }

        public void out(long v){
            pw.print(v);
        }

        public void out(double v) {
            pw.print(v);
        }
    }
}

