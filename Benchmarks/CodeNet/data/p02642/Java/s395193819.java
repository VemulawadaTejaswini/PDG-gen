import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Long,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            map.put((long)A[i],map.getOrDefault((long)A[i],0)+1);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int tmp = A[i];
            List<Pair> primes = new ArrayList<>();
            for (int p = 2; p*p <= tmp; p++) {
                if (tmp%p != 0) continue;

                Pair pair = new Pair(p);
                while (tmp%p == 0) {
                    pair.cnt++;
                    tmp /= p;
                }
                primes.add(pair);
            }
            if (tmp != 1) primes.add(new Pair(tmp,1));
            /*
            for (Pair x : primes) {
                System.out.println(x.p + " " + x.cnt);
            }
            */
            map.put((long)A[i],map.get((long)A[i])-1);
            boolean found = find(primes, map, 0, 1);
            //System.out.println(i+" "+A[i] + " " + found);
            if (!found) {
                ans++;
            }
            map.put((long)A[i],map.get((long)A[i])+1);
        }

        System.out.println(ans);
    }

    private static boolean find(List<Pair> primes, Map<Long,Integer> map, int now, long div) {

        if (now == primes.size()) {
            //System.out.println(" " + div);
            return map.get(div) != null && map.get(div) > 0;
        }

        Pair a = primes.get(now);
        int tmp = 1;
        boolean ret = false;
        for (int i = 0; i <= a.cnt; i++) {
            ret |= find(primes, map, now+1, (long)div*tmp);
            tmp *= a.p;
        }
        return ret;
    }

    private static class Pair {
        final int p;
        int cnt;
        Pair(int p) {
            this.p = p;
            this.cnt = 0;
        }
        Pair(int p, int cnt) {
            this.p = p;
            this.cnt = cnt;
        }
    }
}
