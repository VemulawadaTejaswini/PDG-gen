import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<BigDecimal, Map<Integer, Integer>> numMap = new HashMap<>();
        for (int i=0;i<n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            BigDecimal r;
            int pm = 1;
            if ((a<0 && b<0) || (a>=0 && b>=0)) {
                r = new BigDecimal(String.valueOf((double)a/b));
            } else {
                r = new BigDecimal(String.valueOf((double)b/a*(-1)));
                pm = -1;
            }
            BigDecimal bd = r.setScale(5, RoundingMode.HALF_UP);
            if (numMap.containsKey(bd)) {
                Map<Integer, Integer> subBd = numMap.get(bd);
                if (subBd.containsKey(pm)) {
                    int cn = subBd.get(pm);
                    subBd.put(pm, cn+1);
                } else {
                    subBd.put(pm, 1);
                }
                numMap.put(bd, subBd);
            } else {
                Map<Integer, Integer> subBd = new HashMap<>();
                subBd.put(pm, 1);
                numMap.put(bd, subBd);
            }
        }
        long ans = 1;
        for (BigDecimal key : numMap.keySet()) {
            Map<Integer, Integer> subMap = numMap.get(key);
            int a;
            if (subMap.containsKey(1)) {
                a = subMap.get(1);
            } else {
                a = 0;
            }
            int b;
            if (subMap.containsKey(-1)) {
                b = subMap.get(-1);
            } else {
                b = 0;
            }
            long aSub = 1;
            for (int i=0;i<a;i++) {
                aSub*=2;
            }
            long bSub = 1;
            for (int i=0;i<b;i++) {
                bSub*=2;
            }
            long subAns = aSub + bSub - 1;
            ans *= subAns;
            ans %= 1000000007;
        }
        System.out.println(ans-1);
    }
}
