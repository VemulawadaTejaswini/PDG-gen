import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        boolean neg1 = b < 0;
        boolean neg2 = d < 0;
        boolean over1 = a <= 0 && b >= 0;
        boolean over2 = c <= 0 && d >= 0;
        long ans = -1;
        if (neg1 && neg2) {
            ans = a * c;
        } else if (!over1 && !over2) {
            if (neg1 ^ neg2) {
                ans = Math.max(a * d, b * c);
            } else {
                ans = b * d;
            }
        } else if (over1 ^ over2) {
            if (over1) {
                if (neg2) {
                    ans = 0;
                } else {
                    ans = b * d;
                }
            } else {
                if (neg1) {
                    ans = 0;
                } else {
                    ans = b * d;
                }
            }
        } else {
            ans = Math.max(b * d, a * c);
        }
        System.out.println(ans);

    }
}
