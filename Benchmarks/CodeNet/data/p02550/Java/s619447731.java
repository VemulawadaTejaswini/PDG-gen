import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long x = sc.nextLong();
        int m = sc.nextInt();

        long res = 0;

//        Comb comb = new Comb(n*2, m);

        Set<Long> set = new HashSet<>();
        long[] arr = new long[m*10];

        int left = 0;
        int right = 0;
        for (int i=0; i<m*10; i++) {
            if (set.add(x)) {
                arr[i] = x;
                x *= x;
                x %= m;
            } else {
                int idx = 0;
                for (int j=0; j<arr.length; j++) {
//                    System.out.println(x);
                    if (arr[j] == x) {
                        idx = j;
                        break;
                    }
                }
                left = idx;
                right = i - 1;
                break;
            }
        }

//        System.out.println(left);
//        System.out.println(right);

        long bef = 0;
        long circle = 0;
        long after = 0;

        for (int i=0; i<left; i++) {
            bef += arr[i];
//            bef %= m;
        }

        for (int i=left; i<=right; i++) {
            circle += arr[i];
//            circle %= m;
        }

        n -= left;
        n %= (right-left+1);

        for (int i=left; i<left+n; i++) {
            after += arr[i];
//            after %= m;
        }

//        System.out.println(bef);
//        System.out.println(circle);
//        System.out.println(after);

        System.out.println((bef+circle+after));



//        System.out.println(620*620%m);

//        System.out.println(res);

    }

    public class Comb {
        int n;   //　要素数
        int MOD = (int)1e9+7;
        long[] facts;

        public Comb(int n, int MOD){
            this.n = n;
            this.MOD = MOD;
            facts = new long[n+1];
            facts[0] = 1;
            for (int i=1; i<n+1; i++){
                facts[i] = facts[i-1] * i % MOD;
            }
        }

        // O(log(MOD))
        public long modpow(long a, long b){
            if (b==0) return 1;
            else if (b==1) return a;
            long x = modpow(a, b/2);
            return b%2 == 0 ? x * x % MOD : x * (x*a%MOD) % MOD;
        }

        // 逆元。x^(-1)≡x^(p-2) (MOD p) xとpは互いに素。
        public long inv(long n){
            return modpow(n, MOD-2);
        }

        public long nCk1(int n, int k){
            return n < k ? 0: facts[n] * (inv(facts[n-k]) * inv(facts[k]) % MOD) % MOD;
        }

        // O(k)
        public long nCk2(int n, int k) {
            long ret = 1;
            for (int i=0; i<k; i++) {
                ret = ret * (n - i) % MOD * inv(k - i);
                ret %= MOD;
            }
            return ret % MOD;
        }

    }


}

