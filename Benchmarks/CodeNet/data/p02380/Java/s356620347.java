import java.util.Scanner;

public class Main {
    public double toRad(double inA) {
        double buf;
        buf = (inA / 180.0) * Math.PI;
        return buf;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main app = new Main();

        double a, b, c;
        double s, l, h;
        double d;
        a = Double.parseDouble(scan.next());
        b = Double.parseDouble(scan.next());
        c = Double.parseDouble(scan.next());

        s = a * b * 0.5 * Math.sin(app.toRad(c));
        d = Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(app.toRad(c)));
        l = a + b + d;
        h = 2.0 * s / a;

        System.out.println(s + " " + l + " " + h);
    }
}

