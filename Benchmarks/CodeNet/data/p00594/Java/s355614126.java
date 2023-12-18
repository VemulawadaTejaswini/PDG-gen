import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int[] hash = new int[Integer.MAX_VALUE];
            boolean flag = true;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                hash[k]++;
                if (hash[k] > n / 2) {
                    flag = true;
                    ans = k;
                    break;
                }
            }
            System.out.println(flag ? ans : "NO COLOR");
        }
    }
}