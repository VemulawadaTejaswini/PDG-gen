
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int yd = y2 - y1;
        int xd = x2 - x1;
        int x3 = x2 - yd;
        int y3 = y2 + xd;
        int x4 = x1 - yd;
        int y4 = y1 + xd;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

    }

}
