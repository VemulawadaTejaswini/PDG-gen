import java.util.*;

class Main{
    static double pi = Math.PI;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = (double)sc.nextInt();
        double b = (double)sc.nextInt();
        double h = (double)sc.nextInt();
        double m = (double)sc.nextInt();

        double theta = (h/6.0 - 11.0*m/360.0)*pi;
        double tmp = a*a + b*b - 2.0*a*b*Math.cos(theta);
        System.out.println(Math.sqrt(tmp));


    }

}
