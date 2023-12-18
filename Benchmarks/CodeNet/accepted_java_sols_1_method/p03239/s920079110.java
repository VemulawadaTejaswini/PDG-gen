import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        int ans = Integer.MAX_VALUE;

        for (Point p : arr) {
            if (p.y <= t) {
                ans = Math.min(ans, p.x);
            }
        }
        System.out.println(ans != Integer.MAX_VALUE ? ans : "TLE");
    }
}