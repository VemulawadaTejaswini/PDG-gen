import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Vector<Integer> primes = getPrimes();
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            
            int count = 0;
            
            for (int i = 0; i < primes.size(); i++) {
                int p = primes.get(i);
                if (p > N / 2) break;
                if (primes.contains(N - p)) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
    public static Vector<Integer> getPrimes() {
        Vector<Integer> primes = new Vector<Integer>();
        boolean[] isPrime = new boolean[32769];
        Arrays.fill(isPrime, true);
        for (long i = 2; i < 32769; i++) {
            if (!isPrime[(int)i]) continue;
            for (long j = i * i; j < 32769; j += i) {
                isPrime[(int)j] = false;
            }
        }
        for (int i = 2; i < 32769; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}


