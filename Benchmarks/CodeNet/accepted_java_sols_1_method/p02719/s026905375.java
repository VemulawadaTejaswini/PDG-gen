import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = n - n/k * k;
        ans = Math.min(ans, Math.abs(ans - k));
        System.out.println(ans);
    }
}
