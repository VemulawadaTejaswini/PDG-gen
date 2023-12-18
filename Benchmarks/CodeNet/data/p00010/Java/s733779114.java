import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
             
            double a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            double b = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
            double c = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
             
            double s = (a+b+c)/2;
            double r = a*b*c / (4*Math.sqrt(s*(s-a)*(s-b)*(s-c)));
             
            double A1 = 2*(x2-x1);
            double B1 = 2*(y2-y1);
            double C1 = (x1*x1)-(x2*x2)+(y1*y1)-(y2*y2);
            double A2 = 2*(x3-x1);
            double B2 = 2*(y3-y1);
            double C2 = (x1*x1)-(x3*x3)+(y1*y1)-(y3*y3);
            double X = (B1*C2-B2*C1)/(A1*B2-A2*B1);
            double Y = (C1*A2-C2*A1)/(A1*B2-A2*B1);
 
            System.out.printf("%.3f %.3f %.3f/n",X,Y,r);
        }
    }
    public static double sr(double a) {
        a = a*10000;
        if(a%10 >=  5) {
            a += 10-a%10;
        }
        else {
            a -= a%10;
        }
        int b = (int)a;
         
        return (b/10000.0);
    }
}

