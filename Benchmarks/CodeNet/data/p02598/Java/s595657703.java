
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
    FastIO io = new FastIO("in.txt");
    long[] A;
    long N, K;

    long solve(){
        long l = 0, r = (long)1e9;
        while(l <= r){
            long m = l + (r - l)/2;
            long c = 0;
            for(int i=0; i<N; i++){
                long a = A[i];
                if(m == 0){
                    return 1;
                }else {
                    c += Math.max((a + m - 1) / m - 1, 0);
                }
            }
            if(c <= K){
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return l;
    }

    public void main() throws Exception {
        N = io.nextLong(); K = io.nextLong();
        A = new long[(int)N];
        for(int i=0; i<N; i++){
            A[i] = io.nextLong();
        }

        io.out(solve() + "\n");
    }

    public static void main(String[] args) throws Exception {
        Main task = new Main();
        task.main();
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

