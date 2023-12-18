
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        double ax = scn.nextDouble();
        double ay = scn.nextDouble();
        double bx = scn.nextDouble();
        double by = scn.nextDouble();

        double A = Math.abs(ax-bx);
        double B = Math.abs(ay-by);
        double C = Math.sqrt(Math.pow(A,2)+Math.pow(B,2));

        System.out.printf("%.8f%n",C);


        scn.close();

    }

}
