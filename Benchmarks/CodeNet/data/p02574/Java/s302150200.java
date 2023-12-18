import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int[] A = new int[N];
        final Set<Integer>[] fs = new Set[N];
        
        A[0] = sc.nextInt();
        fs[0] = factorize(A[0]);
        
        final Set<Integer> sum = new HashSet<>(fs[0]);
        final Set<Integer> prod = new HashSet<>(fs[0]);
        long n = fs[0].size();
        
        for (int i = 1; i < N; i++) {
            A[i] = sc.nextInt();
            fs[i] = factorize(A[i]);
            
            sum.addAll(fs[i]);
            prod.retainAll(fs[i]);
            n += fs[i].size();
        }
        
        if (sum.size() == n) {
            System.out.println("pairwise coprime");
            
        } else if (prod.size() == 0) {
            System.out.println("setwise coprime");
            
        } else {
            System.out.println("not coprime");
        }
    }
    
    private static Set<Integer> factorize(int n) {
        Set<Integer> factors = new HashSet<>();
        
        while (n % 2 == 0 && 2 <= n) {
            n /= 2;
            factors.add(2);
        }
        
        int d = 3;
        while (d * d <= n) {
            while (n % d == 0 && d <= n) {
                n /= d;
                factors.add(d);
            }
            d += 2;
        }
        return factors;
    }
}
