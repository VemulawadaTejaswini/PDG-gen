import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> primes = new ArrayList<>();
            check:
            for (int i = 2; i <= n; i++) {
                for (int p : primes) {
                    if (p > Math.sqrt(i)) {
                        break;
                    }
                    if (i % p == 0) {
                        continue check;
                    }
                }
                primes.add(i);
            }
            System.out.println(primes.size());
        }
    }
}
