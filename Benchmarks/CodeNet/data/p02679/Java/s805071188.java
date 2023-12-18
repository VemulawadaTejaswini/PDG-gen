import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int zero = 0;
        HashMap<Pair, Long> nonZeros_positive = new HashMap<>();
        HashMap<Pair, Long> nonZeros_negative = new HashMap<>();
        HashSet<Pair> nonZeros = new HashSet<>();

        for(int i = 0 ; i < N ; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();

            Pair now = new Pair(a,b);

            if(now.equals(Pair.ZERO)){
                zero++;
            }else if(now.b > 0){
                if(nonZeros_positive.containsKey(now)){
                    nonZeros_positive.put(now, nonZeros_positive.get(now)+1);
                }else{
                    nonZeros_positive.put(now, 1L);
                }
            }else{
                now = now.orthogonal();
                if(nonZeros_negative.containsKey(now)){
                    nonZeros_negative.put(now, nonZeros_negative.get(now)+1);
                }else{
                    nonZeros_negative.put(now, 1L);
                }
            }
        }

        for(Pair p : nonZeros_positive.keySet()){
            nonZeros.add(p);
        }
        for(Pair p : nonZeros_negative.keySet()) {
            nonZeros.add(p);
        }

        ModLib mod = ModLib.create(1000000007);
        long ans = 1;
        for(Pair p : nonZeros){
            long add = 0;
            if(nonZeros_positive.containsKey(p) && nonZeros_negative.containsKey(p)){
                add = mod.add(mod.pow(2L, nonZeros_positive.get(p)), mod.pow(2L, nonZeros_negative.get(p)));
                add = mod.sub(add, 1);
            }else if(nonZeros_positive.containsKey(p)){
                add = mod.pow(2L, nonZeros_positive.get(p));
            }else{
                add = mod.pow(2L, nonZeros_negative.get(p));
            }
            ans = mod.mult(ans, add);
        }
        ans = mod.add(ans, zero);
        ans = mod.sub(ans, 1);

        System.out.println(ans);
    }
}

class Pair{
    static public Pair ZERO = new Pair(0,0);
    long a;
    long b;

    Pair(long a, long b){
        if(a == 0 && b == 0){
            this.a = 0;
            this.b = 0;
            return;
        }else if(a == 0){
            this.a = 0;
            this.b = 1;
            return;
        }else if(b == 0){
            this.a = 1;
            this.b = 0;
            return;
        }

        if(a < 0){
            a = -a;
            b = -b;
        }
        long p = a;
        long d = b;
        while((p % d) != 0){
            long tmp = p % d;
            p = d;
            d = tmp;

            if(p < 0){
                p = -p;
                d = -d;
            }
        }
        d = (long)Math.abs(d);
        this.a = a/d;
        this.b = b/d;
    }

    Pair orthogonal(){
        return new Pair(b,-a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return a == pair.a &&
                b == pair.b;
    }

    @Override
    public int hashCode() {
        return (int)(a*31+b);
    }
}

/*
    modを使いたいときのライブラリ
    2^60 ≒ 10^18以下で使うこと
    四則演算・べき乗
    和・差・積：O(1)
    べき乗・逆元・商:O(logn)
 */

class ModLib {
    static public final long NO_MOD = (Long.MAX_VALUE >> 2);
    private final long mod;

    private ModLib(long mod) {
        this.mod = mod;
    }

    static public ModLib create(long mod){
        return new ModLib(mod);
    }

    static public ModLib create(){
        return new ModLib(NO_MOD);
    }

    public long add(long a, long b) {
        return (a + b) % mod;
    }

    public long sub(long a, long b) {
        return (a - b + mod) % mod;
    }

    public long mult(long a, long b) {
        return ((a % mod) * (b % mod)) % mod;
    }

    /*
        aのx乗を求める。
        O(logx)
     */
    public long pow(long a, long x) {
        long res = 1;
        while (x > 0) {
            if (x % 2 == 1) res = mult(res, a);
            a = mult(a, a);
            x >>= 1;
        }

        return res;
    }

    public long inv(long a) {
        return pow(a, mod - 2);
    }

    public long div(long a, long b) {
        return mult(a, inv(b));
    }
}