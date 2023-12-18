
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static double cal_cos(double n) {
        double accuracy = 0.0001f, x1;
        double denominator, cosx, cosval;
        n = n * (3.142f / 180.0f);
        x1 = 1;
        cosx = x1;
        cosval = (double)Math.cos(n);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i - 1);
            x1 = -x1 * n * n / denominator;
            cosx = cosx + x1;
            i = i + 1;
        } while (accuracy <=
                Math.abs(cosval - cosx));

        return cosx;
    }
    static double third_side(double a,
                            double b, double c) {
        double angle = cal_cos(c);

        return (double)Math.sqrt((a * a) +
                (b * b) - 2 * a * b * angle);
    }
    public static void main (String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine()," ");
        double a=Double.parseDouble(st.nextToken());
        double b=Double.parseDouble(st.nextToken());
        double h=Double.parseDouble(st.nextToken());
        double m=Double.parseDouble(st.nextToken());
        double c = calcAngle(h,m);
        System.out.print(Math.round(third_side(a,
                b,c)*1000000000.0)/1000000000.0);
    }
    public static double calcAngle(double h, double m){
        double min=6.0*m;
        double hr=0.5 * (h*60 + m);
        double ang=Math.abs(min-hr);
        return Math.min(ang,360-ang);
    }
}

