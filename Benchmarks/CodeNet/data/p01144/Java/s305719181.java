import java.util.*;

class Main {

    static void solve (int n, int m, ArrayList<Integer> d, ArrayList<Integer> p) {
        OUTER:
        while (m > 0 && (!p.isEmpty()) ) {
            int pMax = Collections.max(p); 
            for (int i = 0; i < p.size(); i++) {
                if (p.get(i) == pMax) {
                    if (m >= d.get(i)) {
                        m -= d.get(i);
                        p.remove(i);
                        d.remove(i);
                        continue OUTER;
                    } else {
                        d.set(i, d.get(i) - m);
                        m = 0;
                        continue OUTER;
                    }
                }
            }
        }

        int res = 0;
        for(int i = 0; i < p.size(); i++) {
            res += d.get(i) * p.get(i);
        }

        System.out.println(res);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == 0 && m == 0)   break;

            ArrayList<Integer> d = new ArrayList<Integer>();
            ArrayList<Integer> p = new ArrayList<Integer>();

            for(int i = 0; i < n; i++) {
                d.add(sc.nextInt());
                p.add(sc.nextInt());
            }

            solve(n, m, d, p);
        }

    }
}