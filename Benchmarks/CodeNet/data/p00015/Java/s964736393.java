import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Lib{
    /* Verify http://codeforces.com/contest/903/problem/D */
    /* ?????? http://math314.hateblo.jp/entry/2015/05/07/014908 */
    static long extgcd(long a,long b,long[]x) {
        for (long u = x[1] = 1, v = x[0] = 0; a!=0;){
            long q = b / a;
            x[0] -= q * u;
            long t=x[0];
            x[0]=u;
            u=t;
            x[1] -= q * v;
            t=x[1];
            x[1]=v;
            v=t;
            b -= q * a;
            t=b;
            b=a;
            a=t;
        }
        return b;
    }

    static long mod_inv(long a,long m) {
        long[]x=new long[2];
        extgcd(a, m, x);
        return (m + x[0] % m) % m;
    }
    static BigInteger garner(long[]a,long[]m){
        int ms=a.length;
        long[]coffs=new long[ms],constants=new long[ms];
        long[]digs=new long[ms];
        Arrays.fill(coffs,1);
        for(int i=0;i<ms;++i){
            long v = (a[i] - constants[i]) * mod_inv(coffs[i], m[i]) % m[i];
            if(v<0)v+=m[i];
            digs[i]=v;
            for (int j = i + 1; j < ms; j++) {
                constants[j] += coffs[j] * v;
                constants[j] %= m[j];
                coffs[j] *= m[i];
                coffs[j] %= m[j];
            }
        }
        BigInteger ans=BigInteger.valueOf(0),c=BigInteger.valueOf(1);
        for(int i=ms-1;i>=0;--i){
            c=c.multiply(BigInteger.valueOf(m[i]));
            ans=ans.multiply(BigInteger.valueOf(m[i]));
            ans=ans.add(BigInteger.valueOf(digs[i]));
        }
        if(ans.compareTo(c.divide(BigInteger.valueOf(2)))>0)
            ans=ans.subtract(c);
        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Random rnd=new Random(0x314159265L);
        int t=sc.nextInt();
        BigInteger lim=BigInteger.TEN.pow(80);
        int ms=12;//(10^9)^12=10^108
        long[]m=new long[ms];
        for(int i=0;i<ms;++i){
            boolean ok;
            do{
                long p=BigInteger.probablePrime(31,rnd).longValue();
                ok=true;
                for(int j=0;j<i;++j)
                    if(m[j]==p){
                        ok=false;
                        break;
                    }
                if(ok)m[i]=p;
            }while(!ok);
        }
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            BigInteger ba=new BigInteger(a);
            BigInteger bb=new BigInteger(b);
            long[]ans=new long[ms];
            for(int i=0;i<ms;++i){
                long ss=ba.mod(BigInteger.valueOf(m[i])).longValue();
                long tt=bb.mod(BigInteger.valueOf(m[i])).longValue();
                ans[i]=(ss+tt)%m[i];
            }
            BigInteger r=Lib.garner(ans,m);
            if(r.compareTo(lim)>=0)
                out.println("overflow");
            else
                out.println(r);
        }
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}