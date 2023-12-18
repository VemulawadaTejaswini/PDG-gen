import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 1;
        while (N-- != 0) {
            if (ans > K) {
                break;
            }
            ans += ans;
        }
        while (N-- != -1) {
            ans += K;
        }
        System.out.println(ans);
    }
}
