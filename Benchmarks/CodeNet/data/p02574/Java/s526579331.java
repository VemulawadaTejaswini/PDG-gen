import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        Sieve sieve = new Sieve(1000002);
        boolean joukenA = true;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = sieve.factorMap(array[i]);
            
            for (Integer key : map.keySet()) {
                if (set.contains(key)) {
                    joukenA = false;
                    break;
                } else {
                    set.add(key);
                }
            }
        }
        
        
        boolean joukenB = false;
        long tmp = array[0];
        for (int i = 1; i < n; i++) {
            tmp = gcd(tmp, array[i]);
        }
        if (tmp == 1) joukenB = true;
        
        String ans = "not coprime";
        if (joukenA) {
            ans = "pairwise coprime";
        } else {
            if (joukenB) {
                ans = "setwise coprime";
            }
        }
        System.out.println(ans);
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}

class Sieve {
    int[] minFactor;    // 最小の素因数

    Sieve(int n) {
        minFactor = new int[n + 1];
        Arrays.fill(minFactor, -1);
        
        for (int i = 2; i <= n; i++) {
            // 素数でないなら篩をかけない
            if (minFactor[i] != -1) continue;
            
            minFactor[i] = i;
            
            // 自分の倍数の最小の素因数を自分とする
            // (但し未確定の数に限る)
            for (int j = 2; i * j <= n; j++) {
                if (minFactor[i * j] == -1) {
                    minFactor[i * j] = i;
                }
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
            int count = res.getOrDefault(f, 0);
            res.put(f, ++count);
        }
        
        // for (int i = 1; i <= x; i++) {
        //     if (!res.containsKey(i)) {
        //         res.put(i, 0);
        //     }
        // }
        
        return res;
    }
}