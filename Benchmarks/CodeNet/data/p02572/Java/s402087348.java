import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        final long MOD = (long)Math.pow(10, 9) + 7;

        for(int i = 0; i < N; i++)
            a[i] = sc.nextLong();

        long sum = 0;
        for(int i = 0; i < N - 1; i++)
        	for(int j = i + 1; j < N; j++)
        		sum += (a[i] * a[j]) % MOD;

        System.out.println(sum % MOD);
    }

}
