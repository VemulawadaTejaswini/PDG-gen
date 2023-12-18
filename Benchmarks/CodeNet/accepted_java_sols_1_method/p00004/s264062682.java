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

        double x = ((double)(int)(((c*e-b*f)*1000)/(a*e-b*d)))/1000;
        double y = ((double)(int)(((c*d-a*f)*1000)/(b*d-a*e)))/1000;
//        BigDecimal x_answer = x.setScale(3, BigDecimal.ROUND_HALF_UP);
//        BigDecimal y_answer = y.setScale(3, BigDecimal.ROUND_HALF_UP);

        System.out.printf("%.3f ",x);
        System.out.printf("%.3f\n",y);

    }

    }
}