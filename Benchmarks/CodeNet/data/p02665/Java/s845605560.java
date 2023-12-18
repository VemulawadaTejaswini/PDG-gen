import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i=0; i<n+1; i++) arr[i] = sc.nextInt();

        long[] max = new long[n+1];
        max[0] = 1 - arr[0];
        if (max[0] < 0) {
            System.out.println(-1);
            return;
        }

        long INF = (long)1e14;
        for (int i=1; i<n+1; i++) {
            if (max[i-1]*2 - arr[i] < 0) {
                System.out.println(-1);
                return;
            }
            if (max[i-1]*2 - arr[i] > INF) {
                for (int j=i; j<n+1; j++) {
                    max[j] = INF;
                }
                break;
            } else {
                max[i] = max[i-1]*2 - arr[i];
            }
        }

//        System.out.println(max[n]);

        long sum = 0;
        long ans = 0;
        for (int i=n; 0<=i; i--) {
            sum = Math.min(sum, max[i]);
            ans += (sum+arr[i]);
            sum += arr[i];
//            System.out.println(sum);
        }

        System.out.println(ans);

    }
}