import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = Long.MAX_VALUE;
        if(n > k){
            n = n - (k * (n / k));
            ans = Long.min(n, Math.abs(n - k));
        } else if(n == k){
            ans = 0;
        } else {
            // (n < k)
            ans = Long.min(n, Math.abs(n - k));
        }
        System.out.println(ans);
    }
}