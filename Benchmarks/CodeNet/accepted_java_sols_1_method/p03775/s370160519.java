import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long ans = Long.MAX_VALUE;
        for(long i=1; i*i<=n; i++) {
            if(n % i == 0) {
                long digitsA = String.valueOf(i).length();
                long digitsB = String.valueOf(n/i).length();
                ans = Math.min(Math.max(digitsA,digitsB),ans);
            }
        }
        System.out.println(ans);
    }
}
