import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] t = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            t[i] = l + i;
            sum += t[i];
        }
        int sumsum = 0;
        int min = 100000;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int hazusi = t[i];
            sumsum = sum - t[i];
            if (min > Math.abs(sum-sumsum)) {
                min = Math.abs(sum-sumsum);
                ans = sumsum;
            }
        }
        System.out.println(ans);
    }

}
