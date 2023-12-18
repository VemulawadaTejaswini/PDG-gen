import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int ans = 1;
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += Integer.parseInt(sc.next());
            if (num > x) {
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
}