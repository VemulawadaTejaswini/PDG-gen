import java.util.Scanner;

// 
class Main{
    final static int MOD = (int)Math.pow(10, 9) + 7;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        long sum = 0;	// n-1項までの合計
        long ans = 0;
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            sum %= MOD;
        }
        
        for(int i = 0; i < N - 1; i++) {
        	sum -= a[i];
        	if(sum < 0) sum += MOD;
            ans += a[i] * sum;
            ans %= MOD;
        }
        
        System.out.println(ans % MOD);
    }

}
