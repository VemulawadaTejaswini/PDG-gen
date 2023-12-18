
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double C = scn.nextDouble();
        double S, c, L, h;
        h = b*Math.sin(Math.toRadians(C));
        S = a*h/2;
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(C)));
        L = a+b+c;
        System.out.printf("%.8f%n",S);
        System.out.printf("%.8f%n",L);
        System.out.printf("%.8f%n",h);

        scn.close();

    }

}
