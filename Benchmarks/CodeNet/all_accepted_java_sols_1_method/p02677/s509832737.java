import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double h = input.nextDouble();
        double m = input.nextDouble();

        double radian = Math.PI*2*(h/12.0 + (m/60.0)/12.0 - m / 60.0);

        double rsq = (a*a+b*b) - (2*a*b)*Math.cos(radian);

        System.out.println(Math.sqrt(rsq));

    }
}