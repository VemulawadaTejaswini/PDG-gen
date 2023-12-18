import java.util.*;

public class Main {

    static long mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] a = new long[n][2];
        int p = 0, m = 0;
        int kp = 0, km = 0;
        long lp = -1, lm = -1, fp = -1, fm = -1;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            a[i][0] = Math.abs(x);
            a[i][1] = x < 0 ? 1 : 0;
            if(a[i][1]== 1) m++;
            else p++;
            if(i < k){
                if(a[i][1]== 1){
                    km++; lm = a[i][0];
                }
                else{
                    kp++; lp = a[i][0];
                }
            }else{
                if(a[i][1] == 1){
                    if(fm < 0) fm = a[i][0];
                }else{
                    if(fp < 0) fp = a[i][0];
                }
            }
        }
        Arrays.sort(a, (x,y) -> Long.compare(y[0], x[0]));
        long ans = 1L;
        if(n == k || (p == 0 && k % 2 != 0)){
            for (int i = 0; i < k; i++) {
                ans = (ans * a[n-1-i][0]) % mod;
            }
            if(km % 2 == 1) ans = mod - ans;
        }else{
            if(km % 2 == 0){
                for (int i = 0; i < k; i++) {
                    ans = (ans * a[i][0]) % mod;
                }
            }else{
                int pc = Math.max(kp+1, k), mc = k - pc;
                if(lp * fp < lm * fm && 0 < fm) {
                    pc -= 2; mc += 2;
                }
                int cp = 0, cm = 0;
                for (int i = 0; i < n; i++) {
                    if(a[i][1] == 0){
                        if(cp < pc){
                            ans = (ans * a[i][0]) % mod;
                            cp++;
                        }
                    }else{
                        if(cm < mc){
                            ans = (ans * a[i][0]) % mod;
                            cm++;
                        }
                    }
                    if(pc == cp && mc == cm) break;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
