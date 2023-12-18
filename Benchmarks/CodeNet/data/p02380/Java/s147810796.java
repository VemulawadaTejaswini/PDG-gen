import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double S,L,h;
        S = a*b*Math.sin(Math.toRadians(c))/2;
        L = a+b+Math.sqrt((Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(c))));
        h = 2*S/a;
        System.out.printf("%f\n%f\n%f\n",S,L,h);
    }
}
