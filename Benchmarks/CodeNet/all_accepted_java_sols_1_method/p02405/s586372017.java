import java.awt.*;
import java.util.*;

/**
 * Created by khrom on 2017/06/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.List<Point> rectList = new ArrayList<>();

        int h;
        int w;
        while (true) {
            h = scanner.nextInt();
            w = scanner.nextInt();
            if (h == 0 && w == 0)
                break;
            rectList.add(new Point(w, h));
        }
        boolean vibrator = false;
        for (Point point : rectList) {
            for (int i = 0; i < point.getY(); i++) {
                if (i % 2 == 1) vibrator = true;
                else vibrator = false;
                for (int j = 0; j < point.getX(); j++) {
                    if (vibrator) System.out.print(".");
                    else System.out.print("#");
                    vibrator = !vibrator;
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}