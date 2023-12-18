import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            B[i] = sc.nextLong();
        }

        int allZero = 0;
        Map<List<Long>, Pair> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long g = gcd(Math.abs(A[i]),Math.abs(B[i]));
            List<Long> ab = new ArrayList<>();
            List<Long> ba = new ArrayList<>();
            if (A[i] == 0 && B[i] == 0) {
                allZero++;
            } else if (A[i] == 0) {
                ab.add(0L);
                ab.add(1L);
                ba.add(-1L);
                ba.add(0L);
            } else if (B[i] == 0) {
                ab.add(1L);
                ab.add(0L);
                ba.add(0L);
                ba.add(-1L);
            } else if ((A[i] > 0 && B[i] > 0) || (A[i] < 0 && B[i] < 0) ) {
                ab.add(Math.abs(A[i])/g);
                ab.add(Math.abs(B[i])/g);
                ba.add(-1L);
                ba.add(Math.abs(B[i])/g);
                ba.add(Math.abs(A[i])/g);
            } else {
                ab.add(-1L);
                ab.add(Math.abs(A[i])/g);
                ab.add(Math.abs(B[i])/g);
                ba.add(Math.abs(B[i])/g);
                ba.add(Math.abs(A[i])/g);
            }
            if (map.containsKey(ab)) {
                map.get(ab).ab++;
            } else if (map.containsKey(ba)) {
                map.get(ba).ba++;
            } else {
                map.put(ab,new Pair(1,0));
            }
        }
        //System.out.println(map);

        long ans = 1;
        for (Map.Entry<List<Long>,Pair> ent : map.entrySet()) {
            List<Long> key = ent.getKey();
            int cntAB = ent.getValue().ab;
            int cntBA = ent.getValue().ba;
            //System.out.println("AB: " + cntAB + ", BA:"+cntBA);
            long tmp;
            if (cntBA > 0) {
                tmp = (pow(2,cntAB) + pow(2,cntBA))%MOD-1;
                tmp = tmp < 0 ? tmp+MOD : tmp;
            } else {
                tmp = pow(2,cntAB);
            }
            //System.out.println(tmp);
            ans *= tmp;
            ans %= MOD;
        }
        ans += allZero;
        ans %= MOD;
 
        System.out.println(ans-1);
    }

    private static class Pair {
        private int ab;
        private int ba;
        Pair(int ab , int ba) {
            this.ab = ab;
            this.ba = ba;
        }
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    private static long pow(long a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b%2 == 1) {
            return a*pow(a,b-1)%MOD;
        }
        long half = pow(a,b/2);
        return half*half%MOD;
    }
}
