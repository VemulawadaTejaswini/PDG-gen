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
        Arrays.sort(a);

        Set<Integer> set = new HashSet<>();

        int gcd = a[0];

        boolean check = false;
        for (int i=0; i<n; i++) {
            gcd = gcd(gcd, a[i]);
            if (!check) {
                for (int key: getDivisors(a[i])) {
                    if (set.contains(key)) {
                        check = true;
                    }
                    set.add(key);
                }
            }
        }
//        System.out.print(set);
//        System.out.print(mapSum);
//        System.out.print(keySet.size());

        if (!check) {
            System.out.print("pairwise coprime");
            return;
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

    List<Integer> getDivisors(int n) {
        var list = new ArrayList<Integer>();
        for (var i = 1; i < (long) Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                list.add(i);
                var divisor = n / i;
                if (divisor != i) {
                    list.add(divisor);
                }
            }
        }

        Collections.sort(list);
        list.remove(0);
        return list;
    }
}

