import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int s = sc.nextInt();

        int cnt = s / 3;
        int remain = s % 3;
        int mod = (int)1e9 + 7;

        Comb comb = new Comb(s, mod);

        long res = 0;

        while (0 < cnt) {
            int div = cnt - 1;
            long tmp = comb.nCk1(div+remain, remain);
            res += tmp;
            res %= mod;
            cnt--;
            remain += 3;
        }

        System.out.print(res % mod);

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

