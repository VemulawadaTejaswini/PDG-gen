import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long tmp = N/K;
        long ans = tmp*tmp*tmp;
        if (K%2==0) {
            long tmp_2 = (N+K/2)/K;
            ans += tmp_2*tmp_2*tmp_2;
        }
        System.out.println(ans);
    }
}