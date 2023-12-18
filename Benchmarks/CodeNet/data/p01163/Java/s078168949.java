import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    final double EPS = 1.0e-10;

    void run() {
        int MAX = 30001;
        boolean isPrime[] = new boolean[MAX];
        List<Integer> primes = new ArrayList<Integer>();
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (int j = i + i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            int T = sc.nextInt();
            if (T == 0)
                break;
            int ans = 0;
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < primes.size(); i++) {
                for (int j = i; j < primes.size(); j++) {
                    int a = primes.get(i);
                    int b = primes.get(j);
                    int c = T - a - b;

                    if (c >= 0 && a + b > c && a + c > b && b + c > a)
                        if (isPrime[c]) {
                            int[] ary = { a, b, c };
                            Arrays.sort(ary);
                            String str = Arrays.toString(ary);
                            if (set.contains(str))
                                continue;
                            set.add(str);
                            // System.out.println(a + " " + b + " " + c);
                            ans++;
                        }
                }
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}