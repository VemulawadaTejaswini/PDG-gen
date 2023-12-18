import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] nums = new long[N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <=N ; j+=i) {
                nums[j]+=1;
            }
        }

        long ans= 0;
        for (int i = 1; i <= N; i++) {
            ans += nums[i]*i;
        }

        System.out.println(ans);
    }
}