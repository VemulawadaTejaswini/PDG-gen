public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var pw = new java.io.PrintWriter(System.out);
        int t = Integer.parseInt(sc.next());
        while (t --> 0) {
            long n = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            pw.println(floorSum(n, m, a, b));
        }
        sc.close();
        pw.flush();
        pw.close();
    }

    public static long floorSum(long n, long m, long a, long b) {
        /**
         * T = floor((A*(N-1)+B)/m);
         * 
         * Goal: Sum[k=1,T]#{0<=i<N|A*i+B>=k*M}
         * 
         * #{i|A*i+B>=kM}=#{i|i>=ceil((kM-B)/A)}=#{i|i>=floor((kM-B+A-1)/A)}=N-floor((kM-B+A-1)/A)
         * 
         * = T*N - Sum[k=1,T]floor((kM-B+A-1)/A))
         * 
         *   M = p*A + q, -B-1 = -r*A + s
         * 
         * = T*N + floor((-B+A-1)/A) - Sum[k=0,T]floor((k*(p*A+q)+A-r*A+s)/A))
         * = T*N + floor((-B+A-1)/A) - Sum[k=0,T](floor((k*q+s)/A))+k*p+1-r)
         * = T*N + floor((-B+A-1)/A) - floorSum(T+1,A,q,s) - p*T*(T+1)/2 + (T+1)*(r-1)
         * = T*N - floorSum(T+1,A,q,s) - p*T*(T+1)/2 + T*(r-1)
         */
        long t = (a * (n - 1) + b) / m;
        if (t == 0) return 0;
        long p = m / a;
        long q = m % a;
        long s = (a - (b % a)) - 1;
        long r = (b + 1 + s) / a;
        // System.out.printf("(n, m, a, b) = (%d, %d, %d, %d) -> ", n, m, a, b);
        // System.out.printf("(p, q, r, s) = (%d, %d, %d, %d)\n", p, q, r, s);
        return t * n - p * t * (t + 1) / 2 + t * (r - 1) - floorSum(t + 1, a, q, s);
    }

    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        if (a == 0) return b;
        for (long r = a % b; r != 0; r = a % b) {
            a = b; b = r;
        }
        return b;
    }
}
