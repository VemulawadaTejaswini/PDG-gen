import java.util.Scanner;

/**
 * Created by dezhonger on 2019/4/13
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int zero = 0;
        int left = 0;
        int res = 0;
        for (int right = 0; right < n; ++right) {
            if (s.charAt(right) == '0') {
                zero++;
                for (int j = right + 1; j < n && s.charAt(j) == '0'; j++) {
                    right = j;
                }
                while (zero > k) {
                    if (s.charAt(left) == '0') {
                        --zero;
                        for (int j = left; j < n && s.charAt(j) == '0'; j++) {
                            left = j;
                        }
                    }
                    left++;
                }

            }
            res = Math.max(res, right - left + 1);
        }
        System.out.println(res);
    }

}
