import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        ArrayList<Long> aList = new ArrayList<Long>();
        ArrayList<Long> bList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            aList.add(sc.nextLong());
        }
        for (int i = 0; i < m; i++) {
            bList.add(sc.nextLong());
        }
        sc.close();

        int ans = 0;
        int maxLoop = n + m;
        if (aList.get(0) <= k && bList.get(0) <= k) {
            System.out.println(ans);
        }else{
            for (int i = 0; i < maxLoop; i++) {
                if (n > 0 && m > 0) {
                    if (aList.get(0) >= bList.get(0)) {
                        k -= aList.get(0);
                        aList.remove(0);
                        n -= 1;

                    } else {
                        k -= bList.get(0);
                        bList.remove(0);
                        m -= 1;
                    }
                } else if (n == 0 && m > 0) {
                    k -= bList.get(0);
                    bList.remove(0);
                    m -= 1;
                } else if (n > 0 && m == 0) {
                    k -= aList.get(0);
                    aList.remove(0);
                    n -= 1;
                }
                ans += 1;

                if (aList.size() == 0 && bList.size() == 0) {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}