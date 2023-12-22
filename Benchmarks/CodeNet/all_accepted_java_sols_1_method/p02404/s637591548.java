
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by khrom on 2017/06/15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Point> rectList = new ArrayList<>();

        int h;
        int w;
        while (true) {
            h = scanner.nextInt();
            w = scanner.nextInt();
            if (h == 0 && w == 0)
                break;
            rectList.add(new Point(w, h));
        }

        for (Point point : rectList) {
            for (int i = 0; i < point.getY(); i++) {
                for (int j = 0; j < point.getX(); j++) {
                    if (i == 0 || i == point.getY() - 1 || j == 0 || j == point.getX() - 1)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}