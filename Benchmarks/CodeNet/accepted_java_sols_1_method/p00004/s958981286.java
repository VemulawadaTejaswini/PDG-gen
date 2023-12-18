import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext() ){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            double e = scanner.nextDouble();
            double f = scanner.nextDouble();

            double x = ((c*e)-(f*b))/((a*e)-(d*b));
            double y = (c-(x*a))/b;

            if (x == -0.0){x = 0;}
            if (y == -0.0){y = 0;}

            System.out.printf("%.3f %.3f\n",x,y);
        }
    }
}
