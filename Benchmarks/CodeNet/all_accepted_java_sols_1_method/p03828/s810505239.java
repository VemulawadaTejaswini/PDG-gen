import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] factor = new int[N+1];
        
        for(int num = 2; num <= N; num++) {
            int n = num;
            for(int i = 2; i * i <= n; i++) { //寻找质因子
                while(n % i == 0) {
                    factor[i]++;
                    n /= i;
                }
            }
            if(n != 1)
                factor[n]++;
        }
        
        long ans = 1;
        for(int a : factor) {
            ans = ans * (a + 1) % 1000000007;
        }

        System.out.println(ans);
    }

}   