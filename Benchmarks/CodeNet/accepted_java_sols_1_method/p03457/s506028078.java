import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tPrevious = 0;
        int xPrevious = 0;
        int yPrevious = 0;
        boolean can = true;
        for (int i=0;i<n;i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dt = t - tPrevious;
            int dist = Math.abs(x - xPrevious) + Math.abs(y - yPrevious);
            if (dt < dist) {
                can = false;
                break;
            }
            if (((dist & 1) ^ (dt & 1) ) == 1) {
                can = false;
                break;
            }
            tPrevious = t;
            xPrevious = x;
            yPrevious = y;
        }
        if (can)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}