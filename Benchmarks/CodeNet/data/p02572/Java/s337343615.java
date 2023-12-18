import java.util.Scanner;

public class Ctest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        long modA = (long)Math.pow(10, 9) + 7;

        long ans = 0;
        long total = 0;
        long a;
        for (int i = 0; i < n; i++) {
            a = Long.parseLong(sc.next());
            ans += total * a;
            ans %= modA;
            total += a;
            total %= modA;
        }
        System.out.print(ans);
    }
}
