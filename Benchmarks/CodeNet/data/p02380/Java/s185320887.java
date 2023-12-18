import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double angle = Math.toRadians(sc.nextDouble());
        double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angle));
        double L = a + b + c;
        double S = (a*b * Math.sin(angle))/2;
        double h = 2 * S / a;
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}

