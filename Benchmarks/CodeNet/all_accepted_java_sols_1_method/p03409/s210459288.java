import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] red = new Point[n];
        Point[] blue = new Point[n];

        for (int i = 0; i < n; i++) {
            red[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            blue[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(blue, Comparator.comparingInt(p -> p.x));
        Arrays.sort(red, Comparator.comparingInt(p -> p.x));
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int index = - 1;
            Point kouho = null;
            for (int j = 0; j < n; j++) {
                if (red[j] == null) {
                    continue;
                }
                if (red[j].x >= blue[i].x) {
                    break;
                }
                if (red[j].x < blue[i].x && red[j].y < blue[i].y) {
                    if (kouho == null || kouho.y < red[j].y) {
                        kouho = red[j];
                        index = j;
                    }
                }
            }
            if (kouho == null) {
                continue;
            }
            red[index] = null;
            ans++;
        }

        System.out.println(ans);
    }
}