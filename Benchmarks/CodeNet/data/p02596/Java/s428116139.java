import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = -1;
        int tmp = 7;
        for (int i = 1; i <= 1000000; i++) {
            if (tmp%K == 0) {
                ans = i;
                break;
            }
            tmp %= K;
            tmp *= 10;
            tmp += 7;
        }

        System.out.println(ans);
    }
}
