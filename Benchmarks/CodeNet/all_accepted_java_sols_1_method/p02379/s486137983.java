
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double a;
        double b;

       
       a = x2 - x1 ;
       b = y2 - y1;
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("%.8f",c);
    }

}

