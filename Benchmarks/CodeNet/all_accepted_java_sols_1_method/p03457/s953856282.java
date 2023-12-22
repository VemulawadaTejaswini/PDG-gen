import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pt = 0;
        int px = 0;
        int py = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int d = Math.abs(px - x) + Math.abs(py - y);
            if (t - pt < d || ((t - pt) + d) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
