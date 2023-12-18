import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ans = a*c;
        if (ans < (a*d)) {
            ans = a*d;
        }
        if (ans < (b*c)) {
            ans = b*c;
        }
        if (ans < (b*d)) {
            ans = b*d;
        }

        System.out.println(ans);
    }
}
