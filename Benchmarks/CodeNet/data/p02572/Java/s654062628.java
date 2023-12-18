import java.util.Scanner;

// 解説を参考した
class Main{
	final static int MOD = (int)Math.pow(10, 9) + 7;
	
    static long[] cumulativeSum(int[] a) {
        long[] b = new long[a.length + 1];
        b[0] = 0;
        for(int i = 0; i < a.length; i++)
            b[i + 1] = b[i] + a[i] % MOD;

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        final int MOD = (int)Math.pow(10, 9) + 7;
        
        for(int i = 0; i < N; i++)
        	a[i] = sc.nextInt();

        long[] b = cumulativeSum(a);
        
        long sum = 0;
        for(int i = 0; i < N; i++)
        	sum += (b[i + 1] - b[i]) * (b[N] - b[i + 1]);
        
        System.out.println(sum % MOD);
    }

}
