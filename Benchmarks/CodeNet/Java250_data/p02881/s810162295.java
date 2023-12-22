import java.util.*;

public class Main {
    static long ans;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ans = n-1;
        divisorList(n);
        System.out.println(ans);
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
                
                ans = Math.min(ans, i+j-2);
            }
        }
        res.sort(Comparator.naturalOrder());
        
        return res;
    }
}