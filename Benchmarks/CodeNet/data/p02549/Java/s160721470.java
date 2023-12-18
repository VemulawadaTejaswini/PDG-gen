// A Java Program to detect cycle in a graph 
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        InputReader sc=new InputReader(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[][]=new int[k][2];
        boolean vis[]=new boolean[n+1];
        for (int i=0;i<k;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            for (int j=arr[i][0];j<=arr[i][1];j++)vis[j]=true;
        }
        ArrayList<Point> list=new ArrayList<>();
        for (int i=0;i<=n;i++){
            int l=-1,r=-1;
            if (vis[i]){
                l=i;
                r=i;
                while (r<=n && vis[r]){
                    r++;
                }
                list.add(new Point(l,r-1));
                i=r;
            }
        }

        long ans=0;
        long mod=998244353;
        long dp[]=new long[n+2];
        dp[n]=1;
        for (int i=n-1;i>=1;i--){
            for (Point p:list){
                int l=p.x,r=p.y;
                int a=-1;
                while (l<=r){
                    int m=(l+r)/2;
                    if (i+m>n){
                        r=m-1;
                    }else {
                        l=m+1;
                        a=m;
                    }
                }
                if (a!=-1){
//                    System.out.println(i+" "+(i+p.x)+" "+(i+a+1));
                    dp[i]=(dp[i]+(-dp[i+a+1]+dp[i+p.x])%mod)%mod;
                }
            }
//            System.out.println(i+" "+dp[i]);
            dp[i]+=dp[i+1];

        }
        System.out.println((dp[1]-dp[2])%mod);



    }


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
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0) return -1;
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
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9') throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}

