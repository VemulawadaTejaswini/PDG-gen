import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 1;

        for (int i = 0; i < N; i++) {
            Long tmp = sc.nextLong();
            double tmpAns = ans;
            if (tmp == 0) {
                ans = 0;
                break;
            }
            if (tmp > (long) Math.pow(10, 18) || tmpAns * tmp > Math.pow(10, 18)) {
                ans = -1;
            }
            if (ans != -1) {
                ans *= tmp;
            }
        }
        sc.close();

        if (ans > (long) Math.pow(10, 18)) {
            ans = -1;
        }
        System.out.println(ans);
    }
}
