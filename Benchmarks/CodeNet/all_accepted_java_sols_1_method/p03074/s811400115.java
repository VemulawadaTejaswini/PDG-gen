import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(0);
        boolean zeroStarted = false;
        int zeroSec = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') {
                if (!zeroStarted) {
                    zeroStarted = true;
                    if (zeroSec >= k) {
                        ans = Math.max(ans, i - ad.poll());
                        continue;
                    }
                }
            }else{
                if (zeroStarted) {
                    zeroStarted = false;
                    ad.add(i);
                    if(zeroSec < k) zeroSec++;
                }
            }
        }
        ans = Math.max(ans, n - ad.poll());
        System.out.println(ans);
        sc.close();

    }

}
