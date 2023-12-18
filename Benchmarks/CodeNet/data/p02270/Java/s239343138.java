import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] weight = new int[n];
        for (int i=0; i<n; i++){
            weight[i] = sc.nextInt();
        }

        // ?????¨??????????´¢???????????§????????????solve???
        // n????????¶?????´???100,000???????????????????????´?????¶???100,000????????\???????????´???1~10^10
        System.out.println(solve(n, k, weight));

    }

    private static long solve(int n, int k, int[] weight) {
        long left = 0;
        long rihgt = 100000 * 100000;

        while(rihgt-left > 1){
            long mid = (left+rihgt)/2;
            int temp = check(mid, n, k, weight);
            if (temp >= n){
                rihgt = mid;
            }
            else {
                left = mid;
            }
        }

        return rihgt;
    }

    private static int check(long p, int n, int k, int[] weight) {

        int i = 0;

        for (int j=0; j<k; j++){
            long s = 0;
            while (s+weight[i] <= p){
                s += weight[i];
                i++;
                if (i == n){
                    return n;
                }
            }
        }

        return i;
    }
}