import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        for (int i=0;i<N;i++) {
            X[i] = sc.nextInt();
        }

        int ans = 1_000_000_000;
        for (int i=1;i<=100;i++) {
            int sum = 0;
            for (int j=0;j<N;j++) {
                sum+=(X[j]-i)*(X[j]-i);
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}