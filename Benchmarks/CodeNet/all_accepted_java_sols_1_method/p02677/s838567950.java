import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        double m = scan.nextDouble();
        double naga = m * 360 / 60;
        double miji = (h * 60 + m) * 360 / (12 * 60);
        double kaku = miji - naga;
        double result = Math.sqrt(a*a + b*b - 2*a*b* Math.cos(Math.toRadians(kaku)));
        System.out.println(result);

    }
}