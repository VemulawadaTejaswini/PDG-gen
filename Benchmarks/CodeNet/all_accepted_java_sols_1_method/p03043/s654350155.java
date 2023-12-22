import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double ans = 0;
        for(int i = 1; i<=N; i++) {
            int now = i;
            double pro = 1;
            while(now < K) {
                now *= 2;
                pro /= 2;
            }
            ans += (double)(1/(double)N)*(pro);
        }
        System.out.println(ans);
    }
}