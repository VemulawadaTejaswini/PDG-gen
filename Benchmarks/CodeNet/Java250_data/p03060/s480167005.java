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
        int[] v = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] > c[i]) {
                ans += v[i] - c[i];
            }
        }
        System.out.println(ans);
    }

}
