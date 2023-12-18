import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        HashSet<Integer> primes = new HashSet<>();
        for (int i = 2; i <= Math.sqrt(m); i++) {
            while (m % i == 0) {
                primes.add(i);
                m /= i;
            }
        }
        if (m != 1) {
            primes.add(m);
        }
        ArrayList<HashSet<Integer>> lists = new ArrayList<>();
        lists.add(primes);
        for (int i = 1; i < primes.size(); i++) {
            HashSet<Integer> tmp = new HashSet<>();
            for (int x : lists.get(i - 1)) {
                for (int y : primes) {
                    if (x % y != 0) {
                        tmp.add(x * y);
                    }
                }
            }
            lists.add(tmp);
        }
        int total = n;
        for (int i = 0; i < lists.size(); i++) {
            for (int x : lists.get(i)) {
                if (i % 2 == 0) {
                    total -= n / x;
                } else {
                    total += n / x;
                }
            }
        }
        System.out.println(total);
    }
}
