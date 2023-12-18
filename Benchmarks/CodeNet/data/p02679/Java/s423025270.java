import java.io.*;
        import java.math.*;
        import java.util.*;
        import java.lang.*;

public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }

    long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

    long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }

    long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    long mod=1000000007;
    long modAdd(long a,long b){
        a%=mod;
        b%=mod;
        return (a+b)%mod;
    }

    long modSub(long a,long b){
        a%=mod;
        b%=mod;
        return ((a-b)%mod+mod)%mod;
    }

    long modMul(long a,long b){
        a%=mod;
        b%=mod;
        return (a*b)%mod;
    }



    PrintWriter out;
    InputReader sc;

    public void run() {
        sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        out = new PrintWriter(System.out);


        int n=sc.nextInt();
        long a[][]=new long[n][2];
        int zero=0;
        HashMap<Node,Integer> hm=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <2 ; j++) {
                a[i][j]=sc.nextLong();
            }
            if(a[i][0]==0 || a[i][1]==0)zero++;
            else{
                long gcd=gcd(Math.abs(a[i][0]),Math.abs(a[i][1]));
                a[i][0]/=gcd;
                a[i][1]/=gcd;
                Node temp=new Node(a[i][0],a[i][1]);
                hm.put(temp,hm.getOrDefault(temp,0)+1);
            }
        }
        long ans=modPow(2,zero,mod);
        HashSet<Node> hs=new HashSet<>();
        ArrayList<Pair> l=new ArrayList<>();
        for(Node pair1:hm.keySet()){
            if(hs.contains(pair1))continue;
            Node oposite=new Node(pair1.denominator,pair1.numerator,-1l*pair1.sign);
            if(hm.containsKey(oposite)){
                l.add(new Pair(hm.get(pair1),hm.get(oposite)));
                hs.add(pair1);
                hs.add(oposite);
            }
            else {
                l.add(new Pair(hm.get(pair1),-1));
                hs.add(pair1);
            }
        }
        for(Pair x:l){
            if(x.b!=-1)ans=modMul(ans,modAdd(modPow(2,x.a,mod),modSub(modPow(2,x.b,mod),1)));
            else ans=modMul(ans,modPow(2,x.a,mod));
        }
        out.println(ans-1);





        out.close();
    }

    class Pair{
        long a,b;

        public Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

    class Node{
        @Override
        public String toString() {
            return "Node{" +
                    "numerator=" + numerator +
                    ", denominator=" + denominator +
                    ", sign=" + sign +
                    '}';
        }

        long numerator,denominator,sign;

        public Node(long numerator, long denominator) {
            this.numerator = Math.abs(numerator);
            this.denominator = Math.abs(denominator);
            sign=(numerator>=1?1:-1)/(denominator>=1?1:-1);
        }

        public Node(long numerator, long denominator,long s) {
            this.numerator = Math.abs(numerator);
            this.denominator = Math.abs(denominator);
            sign=s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;

            Node node = (Node) o;

            if (numerator != node.numerator) return false;
            if (denominator != node.denominator) return false;
            return sign == node.sign;
        }

        @Override
        public int hashCode() {
            int result = (int) (numerator ^ (numerator >>> 32));
            result = 31 * result + (int) (denominator ^ (denominator >>> 32));
            result = 31 * result + (int) (sign ^ (sign >>> 32));
            return result;
        }
    }

}