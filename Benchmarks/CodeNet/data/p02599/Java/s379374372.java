
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    FastIO io = new FastIO("in.txt");
    int N, Q;
    int[] C;
    int[] mxis;
    Qry[] Qs;

    void solve(){
        Node[] nodes = new Node[N];
        Node sgt = new Node(0, N-1, null, nodes);

        shuffle(Qs);
        Arrays.sort(Qs, new Comparator<Qry>() {
            @Override
            public int compare(Qry a, Qry b) {
                return a.qr - b.qr;
            }
        });

        mxis = new int[N+1];
        Arrays.fill(mxis, -1);

        int l = 0;
        for(int i=0; i<Q; i++){
            int r = Qs[i].qr;
            for(int j=l; j<=r; j++){
                int a = C[j];
                int mai = mxis[a];
                if(mai >= 0) {
                    nodes[mai].add(-1);
                }
                nodes[j].add(1);
                mxis[a] = j;
            }
            Qs[i].ans = sgt.sum(Qs[i].ql, Qs[i].qr);
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
        N = io.nextInt(); Q = io.nextInt();
        C = new int[N];
        for(int i=0; i<N; i++){
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
            ql = l - 1; qr = r - 1;
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

    class FastIO {
        BufferedReader br;
        StringTokenizer sk;

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
            System.out.print(v);
        }

        public void out(int v) {
            System.out.print(v);
        }

        public void out(long v){
            System.out.print(v);
        }

        public void out(double v) {
            System.out.print(v);
        }
    }
}

