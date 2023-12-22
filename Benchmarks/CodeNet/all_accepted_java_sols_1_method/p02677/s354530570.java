import java.util.*;
public class Main {
    public static void main(String agrs[])
    {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();
        double m = in.nextDouble();
        h *= 30;
        m *= 6;
        h += m / 12;
        if(m == 0)
        {
            m = 360.0;
        }
        if(h == 0)
        {
            h = 360.0;
        }
        double angle = Math.min(Math.abs(h - m), Math.abs(m - h));
        angle /= 180;
        angle *= Math.PI;
        double hyp = Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(angle));
        hyp = Math.sqrt(hyp);
        System.out.println(hyp);
    }
}
