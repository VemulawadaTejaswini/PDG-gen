import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        double h = in.nextInt();
        double m = in.nextInt();

        double hrad = ((30 * h + 0.5 * m) / 180) * Math.PI;
        double hx = Math.cos(hrad) * a;
        double hy = Math.sin(hrad) * a;

        double mrad = ((6 * m) / 180) * Math.PI;
        double mx = Math.cos(mrad) * b;
        double my = Math.sin(mrad) * b;

        double xp = (mx - hx) * (mx - hx);
        double yp = (my - hy) * (my - hy);
        System.out.println(Math.sqrt(xp + yp));

    }
}