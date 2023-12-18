import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();
        long d = in.nextInt();
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, a*c);
        ans = Math.max(ans, a*d);
        ans = Math.max(ans, b*c);
        ans = Math.max(ans, b*d);
        System.out.println(ans);
    }
}
