import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        long ans;
        ans = Math.max(a * c, b * d);
        ans = Math.max(a * d, ans);
        ans = Math.max(b * c, ans);
        if ((a <= 0 && b >= 0) || (c <= 0 && d >= 0)) ans = Math.max(0, ans);
        System.out.println(ans);
    }
}