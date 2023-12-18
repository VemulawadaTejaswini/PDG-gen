import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = Math.toRadians(sc.nextDouble());
        
        double s,l,h;
        s = a*b*Math.sin(c)/2;
        l = a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c));
        h = b*Math.sin(c);

        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
    }
}

