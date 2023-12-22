import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            double x1 = scn.nextDouble();
            double y1 = scn.nextDouble();
            double x2 = scn.nextDouble();
            double y2 = scn.nextDouble();
            double ans = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            System.out.println(ans);
        }
    }
}