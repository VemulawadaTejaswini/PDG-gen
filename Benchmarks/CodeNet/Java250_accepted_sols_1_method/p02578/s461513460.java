import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tmp1 = 0;
        long tmp2 = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            tmp1 = tmp2;
            tmp2 = sc.nextInt();
            long x = tmp1 - tmp2;
            if (x > 0) {
                ans += x;
                tmp2 += x;
            }
        }
        System.out.println(ans);
    }
}
