import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt(), y1 = scan.nextInt();
        int x2 = scan.nextInt(), y2 = scan.nextInt();
        double dx = Math.abs(x2 - x1), dy = Math.abs(y2 - y1);
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        System.out.println(distance);
    }
}