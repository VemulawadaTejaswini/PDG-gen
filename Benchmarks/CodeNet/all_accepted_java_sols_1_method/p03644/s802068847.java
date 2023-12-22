import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        int ans_cnt = -1;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            int cnt = 0;
            while (true) {
                if (tmp % 2 == 0) {
                    cnt++;
                } else {
                    break;
                }
                tmp /= 2;
            }
            if (ans_cnt < cnt) {
                ans_cnt = cnt;
                ans = i;
            }
        }

        System.out.println(ans);
    }
}