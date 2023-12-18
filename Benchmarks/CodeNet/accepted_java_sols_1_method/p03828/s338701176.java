import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 2; i <= n; i++) {
            int x = i;
            for (int j = 2; j <= i; j++) {
                while(x % j == 0){
                    a[j]++;
                    x /= j;
                }
                if(x < 2) break;
            }
        }
        long ans = 1L;
        for (int i = 2; i < n+1; i++) {
            if(a[i] > 0) ans = ans * (a[i] + 1) % 1_000_000_007;
        }
        System.out.println(ans);
        sc.close();
    }

}
