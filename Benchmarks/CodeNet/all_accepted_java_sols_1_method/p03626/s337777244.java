import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s1 = sc.next().toCharArray();
        char[] s2 = sc.next().toCharArray();
        long MOD = 1_000_000_007;
        long ans = 1;
        int prev = 0; // 0: vertical, 1: horizontal
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == s2[i]) {
                if (i == 0) {
                    ans *= 3;
                    prev = 0;
                    continue;
                }
                if (prev == 0) {
                    ans *= 2;
                }
                prev = 0;
            } else {
                if (i == 0) {
                    ans *= 6;
                    prev = 1;
                    i++;
                    continue;
                }
                if (prev == 0) {
                    ans *= 2;
                } else {
                    ans *= 3;
                }
                prev = 1;
                i++;
            }
            ans %= MOD;
        }
        System.out.println(ans);
    }

}
