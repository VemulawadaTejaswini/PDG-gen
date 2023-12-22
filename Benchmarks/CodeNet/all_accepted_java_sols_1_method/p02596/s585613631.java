import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int L;
        int res = -1;
        if (K % 7 == 0) {
            L = 9 * K / 7;
        } else {
            L = 9 * K;
        }
        if (!(L % 2 == 0 || L % 5 == 0)) {
            int now = 10;
            for (int i = 1; i <= L; i++) {
                if (now % L == 1) {
                    res = i;
                    break;
                }
                now = (now % L) * 10;
            }
        }
        System.out.println(res);
        sc.close();
    }
}