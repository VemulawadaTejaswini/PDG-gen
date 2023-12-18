import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        int one = 0;
        for (int i=0; i<n; i++) {
            if (a[i] == 1) one++;
        }

        Map[] map = new HashMap[n];

        for (int i=0; i<n; i++) {
            PrimeFact primeFact = new PrimeFact(a[i]);
            map[i] = primeFact.query(a[i]);
//            System.out.print(map[i]);
        }

        long mapSum = 0;
        for (int i=0; i<n; i++) {
            mapSum += map[i].size();
        }

        Set<Integer> keySet = new HashSet<>();
        for (int i=0; i<n; i++) {
            Iterator<Integer> itr = map[i].keySet().iterator();
            while (itr.hasNext()) {
//                System.out.print(itr.next());
                keySet.add(itr.next());
            }
        }

        if ((mapSum == keySet.size() + (one - 1)) || (mapSum == keySet.size() && one==0)) {
            System.out.print("pairwise coprime");
            return;
        }




        int gcd = a[0];

        for (int i=1; i<n; i++) {
            gcd = gcd(gcd, a[i]);
        }

        if (gcd == 1) {
            System.out.print("setwise coprime");
            return;
        }

        System.out.print("not coprime");

    }

    int gcd(int c, int d) {
        if (c < d) return gcd(d, c);
        if (d == 0) return c;
        return gcd(d, c % d);
    }

    class PrimeFact {
        int[] spf;
        PrimeFact(Integer n) {
            init(n);
        }
        void init(int n) {
            spf = new int[n+1];
            for (int i=0; i<=n; i++) spf[i] = i;
            for (int i=2; i*i<=n; i++) {
                if (spf[i] == i) {
                    for (int j=i*i; j<=n; j+=i) {
                        if (spf[j] == j) {
                            spf[j] = i;
                        }
                    }
                }
            }
        }
        Map<Integer, Integer> query(Integer n) {
            Map<Integer, Integer> map = new HashMap<>();
            while (n != 1) {
                if (map.containsKey(spf[n])) {
                    int val = map.get(spf[n]) + 1;
                    map.put(spf[n], val);
                } else {
                    map.put(spf[n], 1);
                }
                n /= spf[n];
            }
            return map;
        }
    }

}

