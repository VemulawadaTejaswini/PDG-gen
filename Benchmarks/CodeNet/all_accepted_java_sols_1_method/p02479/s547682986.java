import java.util.*;

class Main
{
    private final static double PI = Math.PI;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double r;
        r = s.nextDouble();
        System.out.printf("%6f %6f\n",r*r*PI,2.0 * r * PI);
    }
}