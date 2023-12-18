import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> primeList = new ArrayList<>();
        Set<Integer> exist = new HashSet<>();
        Set<Integer> forall = new HashSet<>();
        boolean pairwise = true;
        boolean setwise = true;

        for (int n = 2; n < (int) 1e6; n++) {
            boolean isPrime = true;
            for (int i : primeList) {
                if ((n % i) == 0) {
                    isPrime = false;
                    break;
                }
                if (i * i > n) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeList.add(n);
                forall.add(n);
            }
        }

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            Set<Integer> primes = new HashSet<>();
            for (int p : primeList) {
                if ((n % p) == 0) {
                    do {
                        n /= p;
                    } while ((n % p) == 0);

                    if (exist.contains(p)) {
                        pairwise = false;
                    } else {
                        exist.add(p);
                    }

                    if (forall.contains(p)) {
                        primes.add(p);
                    }
                }
                if (n == 1) {
                    break;
                }
            }
            forall = primes;
        }

        setwise = forall.isEmpty();
        System.out.println(pairwise ? "pairwise coprime" : (setwise ? "setwise coprime" : "not coprime"));
    }

}
