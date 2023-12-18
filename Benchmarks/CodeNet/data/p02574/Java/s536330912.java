import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    
    private static int[] getSieve(int max) {
        int[] sieve = new int[max + 1];
        sieve[1] = 1;
        
        for (int i = 2; i <= max; i++) {
            if (0 < sieve[i]) {
                continue;
            }
            
            int j = i;
            while (j <= max) {
                sieve[j] = i;
                j += i;
            }
        }
        return sieve;
    }
    
    private static Set<Integer> factorize(int n, int[] sieve) {
        Set<Integer> factors = new HashSet<>();
        
        while (1 < n) {
            int p = sieve[n];
            factors.add(p);
            n /= p;
        }
        
        return factors;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int aMax = Arrays.stream(A).max().getAsInt();
        final int[] sieve = getSieve(aMax);
        
        Set<Integer>[] factors = IntStream.range(0, N).parallel()
                .mapToObj(i -> factorize(A[i], sieve))
                .toArray(Set[]::new);
        
        int count = factors[0].size();
        Set<Integer> sum = new HashSet<>(factors[0]);
        Set<Integer> prod = new HashSet<>(factors[0]);
        
        for (int i = 1; i < N; i++) {
            count += factors[i].size();
            sum.addAll(factors[i]);
            prod.retainAll(factors[i]);
        }
        
        if (sum.size() == count) {
            System.out.println("pairwise coprime");
            
        } else if (prod.size() == 0) {
            System.out.println("setwise coprime");
            
        } else {
            System.out.println("not coprime");
        }
    }
}
