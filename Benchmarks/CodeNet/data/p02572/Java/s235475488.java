import java.util.Scanner;

// 
class Main{
    final static long MOD = (long)(Math.pow(10, 9) + 7);

    static long[] cumulativeSum(long[] a) {
        long[] b = new long[a.length + 1];
        b[0] = 0;
        for(int i = 0; i < a.length; i++)
            b[i + 1] = (b[i] + a[i]) % MOD;

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];

        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();

        long[] b = cumulativeSum(a);

        long sum = 0L;
        for(int i = 0; i < N - 1; i++) {
            sum += a[i] * (b[N] - b[i + 1]) + MOD;
            sum %= MOD;
        }

        System.out.println(sum);
    }

}
