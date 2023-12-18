import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long n = N;
        int ans = 0;
        if(N == 1) {
            ans = 0;
        }else {
            while(n > 1) {
                boolean isSosu = true;
                for(int i=2; i<=Math.sqrt(n); i++) {
                    if(n % i == 0) {
                        n /= i;
                        ans++;
                        isSosu = false;
                        int k = i;
                        while(true) {
                            k *= i;
                            if(n % k == 0) {
                                
                                n /= k;
                                ans++;
                            }else {
                                break;
                            }
                        }
                        break;
                    }
                }
                if(isSosu) {
                    if(n == 1) {
                        break;
                    }
                    ans++;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
