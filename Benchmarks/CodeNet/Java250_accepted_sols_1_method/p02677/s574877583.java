import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        double a = c.nextInt();
        double b = c.nextInt();
        double h = c.nextInt();
        double m = c.nextInt();
        double angle = ((h*60+m)/(12*60))*2*Math.PI-m/30*Math.PI;
        System.out.println(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(angle)));
    }
}
