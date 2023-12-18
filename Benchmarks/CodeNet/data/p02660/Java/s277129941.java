import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long n = N;
        int ans = 0;
        ArrayList<Long> list = new ArrayList<>();
        if(N == 1) {
            ans = 0;
        }else {
            while(n > 1) {
                boolean isSosu = true;
                for(long i=2; i<=Math.sqrt(n); i++) {
                    if(n % i == 0) {
                        isSosu = false;
                        n /= i;
                        list.add(i);
                        ans++;
                        long k = i;
                        while(true) {
                            k *= i;
                            if(n % k == 0) {
                                list.add(k);
                                n /= k;
                                ans++;
                            }else {
                                break;
                            }
                        }
                    }
                }
                if(isSosu) {
                    if(n == 1) {
                        break;
                    }else if(list.contains(n)) {
                        break;
                    }else {
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
