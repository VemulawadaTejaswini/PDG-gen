import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (h.containsKey(a)) {
                h.put(a, h.get(a) + 1);
            } else {
                h.put(a, 1);
            }
        }
        sc.close();
        boolean f = true;
        for (int k : h.keySet()) {
            if (n % 2 == 1 && k == 0) {
                if (h.get(k) != 1) {
                    f = false;
                    break;
                }
            } else if (h.get(k) != 2) {
                f = false;
                break;
            }
        }
        BigInteger bn = new BigInteger("2");
        BigInteger bm = new BigInteger("1000000007");
        BigInteger bp = new BigInteger(Integer.toString(n / 2));
        System.out.println((f ? bn.modPow(bp, bm) : 0));
    }
}