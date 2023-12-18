import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double x = (c*e-b*f)/(a*e-b*d);
        double y = (c*d-a*f)/(b*d-a*e);

        System.out.printf("%.3f ",x);
        System.out.printf("%.3f\n",y);

    }

    }
}