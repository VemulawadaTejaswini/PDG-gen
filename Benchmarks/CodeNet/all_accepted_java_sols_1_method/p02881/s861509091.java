import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = n - 1;
        for(int i = 2; i <= (int)Math.sqrt(n) + 1; i++) {
            if(n % i == 0) ans = Math.min(ans, i + n / i - 2);
        }
        System.out.println(ans);
    }
}
