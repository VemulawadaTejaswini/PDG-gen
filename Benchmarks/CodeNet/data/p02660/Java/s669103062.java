import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        
        
        List<Long> list = divisorList(a);
        long aa = (long)Math.sqrt(a);
        
        long count = -1;
        long now = a;
        Set<Long> set = new HashSet<Long>();
        for (Long b : list) {
            boolean ok = true;
            for (Long c : set) {
                if (b % c == 0) {
                    ok = false;
                    break;
                }
            }
            if (!ok) continue;
            // System.out.println(b + " " + now + " " + count);
            // if (b > tmp) continue;
            
            if (b == 1) {
                count++;
                continue;
            }
            
            long tmp = b;
            while (now % tmp == 0) {
                now /= tmp;
                count++;
                tmp *= b;
                
            }
            set.add(b);
        }
        System.out.println(count);
    }
    
    public static List<Long> divisorList(long n) {
        List<Long> res = new ArrayList<Long>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                
                long j = n / i;
                if (j != i) {
                    res.add(j);
                }
            }
        }
        res.sort(Comparator.naturalOrder());
        
        return res;
    }
}

class Sieve {
    int[] minFactor;    // 最小の素因数

    Sieve(int n) {
        minFactor = new int[n + 1];
        minFactor[0] = -1;
        minFactor[1] = -1;
        
        for (int i = 2; i <= n; i++) {
            if (minFactor[i] != 0) continue;
            
            minFactor[i] = i;
            
            if ((long)i * i > (long)n) continue;
            
            for (int j = i * i; j <= n; j += i) {
                if (minFactor[j] != 0) continue;
                
                minFactor[j] = i;
            }
        }
    }
    
    boolean isPrime(int x) {
        if (minFactor[x] == x) {
            return true;
        }
        
        return false;
    }
    
    // nの素因数のリスト (60 => [2, 2, 3, 5])
    List<Integer> factorList(int x) {
        List<Integer> res = new ArrayList<Integer>();
        
        while (x != 1) {
            res.add(minFactor[x]);
            x /= minFactor[x];
        }
        
        return res;
    }
    
    // nの素因数の頻度 (60 => (2 => 2, 3 => 1, 5 => 1)
    Map<Integer, Integer> factorMap(int x) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        
        List<Integer> factorList = factorList(x);
        
        for (Integer f : factorList) {
            if (!res.containsKey(f)) {
                res.put(f, 1);
            } else {
                int count = res.get(f);
                res.put(f, count + 1);
            }
        }
        
        // for (int i = 1; i <= x; i++) {
        //     if (!res.containsKey(i)) {
        //         res.put(i, 0);
        //     }
        // }
        
        return res;
    }
}