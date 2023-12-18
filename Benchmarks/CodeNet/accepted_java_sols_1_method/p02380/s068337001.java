import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double C = sc.nextDouble();

        double S = a * b * Math.sin(C/180.*Math.PI) / 2;

        double h = b * Math.sin(C/180.*Math.PI);
        
        double l = (a - b * Math.cos(C/180.*Math.PI));
        double c = Math.sqrt(h*h+l*l);
        double L = a + b + c;

        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(5);
        format.setMinimumFractionDigits(5);
        format.setGroupingUsed(false);
        System.out.println("" + format.format(S));
        System.out.println("" + format.format(L));
        System.out.println("" + format.format(h));
    }
}