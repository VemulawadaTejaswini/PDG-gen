import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            if (p[i] != i+1) {
                cnt++;
            }
        }
        if (cnt > 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

}
