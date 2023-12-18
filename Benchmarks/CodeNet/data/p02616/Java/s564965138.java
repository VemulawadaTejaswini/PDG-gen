import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    static PrintWriter out;
    static Reader in;
    public static void main(String[] args) throws IOException {
        //out = new PrintWriter(new File("out.txt"));
        //PrintWriter out = new PrintWriter(System.out);
        //in = new Reader(new FileInputStream("in.txt"));
        //Reader in = new Reader();
        input_output();
        Main solver = new Main();
        solver.solve();
        out.flush();
        out.close();
 
    }
 
    static int INF = (int)2e9+5;
    static int maxn = (int)2e6+5;
    static int mod=(int)1e9+7 ;
    static int n, m, t, q, k;
    
    void solve() throws IOException{
        n = in.nextInt();
        k = in.nextInt();

        ArrayList<Integer> poslist = new ArrayList<>(),
                        neglist = new ArrayList<>();

        int[] arr = new int[n];
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > 0) {
                pos++;
                poslist.add(arr[i]);
            } else if (arr[i] == 0){
                zero++;
            } else {
                neg++;
                neglist.add(arr[i]);
            }
        }
        Collections.sort(neglist);
        Collections.sort(poslist);

        neg = Math.min(neg, k);
        int cnt = ((neg%2== 0) ? neg: neg-1)+pos;
        boolean bigthanzero = true;
        if (cnt < k) bigthanzero = false;

        if (!bigthanzero) {
            if (zero != 0) out.println("0");
            else {
                //biggest negative number.
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < n ;i++) list.add(Math.abs(arr[i])); 
                Collections.sort(list);
                long ans = 1;
                for (int i = 0; i < k; i++) ans = (ans*list.get(i))%mod;
                ans = (-ans+mod)%mod;
                out.println(ans);
            }
        } else {
            // biggest positive number.
            long ans = 1;
            ArrayList<Integer> negg = new ArrayList<Integer>();
            for (int i = neglist.size()-1; i >= 0; i--) {
                negg.add(Math.abs(neglist.get(i)));
            }
            Collections.sort(negg);

            int negcnt = 0, poscnt = 0;

            int curn = negg.size()-1, curp = poslist.size()-1;
            int posnum = 0, negnum = 0;
            while (k != 0) {
                if (curn >= 0) negnum = negg.get(curn);
                if (curp >= 0) posnum = poslist.get(curp);
                if (curn == -1) {
                    curp--;
                    poscnt++;
                } else if (curp == -1) {
                    curn--;
                    negcnt++;
                } else {
                    if (posnum > negnum) {
                        curp--;
                        poscnt++;
                    } else {
                        curn--;
                        negcnt++;
                    }
                }
                k--;
            }
            if (negcnt%2==1) {
                if (poscnt == poslist.size()) {
                    poscnt--;
                    negcnt++;
                    curp++;
                    curn--;
                } else if (negcnt == negg.size()) {
                    negcnt--;
                    poscnt++;
                    curp--;
                    curn++;
                } else {
                    if ((long)poslist.get(curp)*(long)((curp<poslist.size()-1)?poslist.get(curp+1):1L) > (long)((curn<negg.size()-1)?negg.get(curn+1):1L)*(long)negg.get(curn)) {
                        negcnt--;
                        poscnt++;
                        curp--;
                        curn++;
                    } else {
                        poscnt--;
                        negcnt++;
                        curp++;
                        curn--;
                    }
                }
            }
            for (int i = poslist.size()-poscnt; i < poslist.size(); i++) ans = (ans*poslist.get(i))%mod;
            for (int i = negg.size()-negcnt; i < negg.size(); i++) ans = (ans*negg.get(i))%mod;             

            out.println(ans);
        }
    }
 
    //<>

    static class Reader {
 
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
    
        public Reader() {
            this(System.in);
        }
    
        public Reader(InputStream is) {
            mIs = is;
        }
    
        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
    
        }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
    
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
    
        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
    
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
    
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
    
        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
    
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    
        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
 
    }
    static void input_output() throws IOException {
        File f = new File("in.txt");
        if(f.exists() && !f.isDirectory()) { 
            in = new Reader(new FileInputStream("in.txt"));
        } else in = new Reader();
        f = new File("out.txt");
        if(f.exists() && !f.isDirectory()) {
            out = new PrintWriter(new File("out.txt"));
        } else out = new PrintWriter(System.out);
    }
}