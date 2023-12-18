import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] nums = new long[10][10];
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            int head = s.charAt(0) - '0';
            int tail = s.charAt(s.length() - 1) - '0';
            nums[head][tail]++;
        }
        long ans = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                ans += nums[i][j] * nums[j][i];
            }
        }
        System.out.println(ans);
    }

}
