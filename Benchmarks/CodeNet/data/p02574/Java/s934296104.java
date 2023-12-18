import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        Map[] map = new HashMap[n];

        for (int i=0; i<n; i++) {
            map[i] = primes(a[i]);
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

        if (mapSum == keySet.size()) {
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

    Map<Integer, Integer> primes(int n) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        while (n >= 4 && n % 2 == 0) {
            list.add(2);
            n /= 2;
        }
        int d = 3;
        int q = n / d;
        while (q >= d) {
            if (n % d == 0) {
                list.add(d);
                n = q;
            } else {
                d += 2;
            }
            q = n / d;
        }
        list.add(n);

        for (int t: list) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        return map;
    }

}

