import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        long ans = 100L * (n-m);
        ans += 1900L * m;
        System.out.println(ans<<m);
    }
}