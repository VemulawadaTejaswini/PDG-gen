
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] d = new int[n+1];
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
//                d[j]++;
                ans += j;
            }
        }
        System.out.println(ans);

    }
}
