import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double dx = x1 - x2;
        double dy = y1 - y2;
        double d = Math.sqrt(dx*dx+dy*dy);
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(5);
        format.setMinimumFractionDigits(5);
        format.setGroupingUsed(false);
        System.out.println("" + format.format(d));
    }
}