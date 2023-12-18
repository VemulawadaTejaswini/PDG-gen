import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] xs = new int[n];
        int [] ys = new int[n];
        for(int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            ys[i] = sc.nextInt();
        }
        double d1 = 0;
        double d2 = 0;
        double d3 = 0;
        double di = 0;
        for(int i = 0; i < n; i++) {
            double d = xs[i] - ys[i];
            if(d < 0) d = -d;
            d1 += d;
            d2 += d*d;
            d3 += d*d*d;
            if(d > di) di = d;
        }
        d2 = Math.sqrt(d2);
        d3 = Math.pow(d3, 1./3);
        
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(5);
        format.setMinimumFractionDigits(5);
        format.setGroupingUsed(false);
        System.out.println("" + format.format(d1));
        System.out.println("" + format.format(d2));
        System.out.println("" + format.format(d3));
        System.out.println("" + format.format(di));
    }
}