import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ct, cx, cy;
        ct = cx = cy = 0;
        int t, x, y;
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            t = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            int distance = Math.abs(x-cx) + Math.abs(y-cy);
            if (t-ct < distance || ((t-ct)-distance)%2 == 1) {
                possible = false;
                break;
            } 
            ct = t;
            cx = x;
            cy = y;
        }
        if (possible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}