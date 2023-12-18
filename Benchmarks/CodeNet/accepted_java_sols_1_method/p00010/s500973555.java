import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)){
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                for (int i=0;i<n;i++){
                    double x1 = sc.nextDouble();
                    double y1 = sc.nextDouble();
                    double x2 = sc.nextDouble();
                    double y2 = sc.nextDouble();
                    double x3 = sc.nextDouble();
                    double y3 = sc.nextDouble();
                    double G = ( y2*x1-y1*x2 +y3*x2-y2*x3 +y1*x3-y3*x1 );
                    double Xc = ((x1*x1+y1*y1)*(y2-y3)+(x2*x2+y2*y2)*(y3-y1)+(x3*x3+y3*y3)*(y1-y2))/(2*G);
                    double Yc =-((x1*x1+y1*y1)*(x2-x3)+(x2*x2+y2*y2)*(x3-x1)+(x3*x3+y3*y3)*(x1-x2))/(2*G);
                    double r = Math.sqrt( (x1 - Xc) * (x1 - Xc) + (y1 - Yc) * (y1 - Yc) );
                    System.out.println(String.format("%.3f %.3f %.3f",Xc, Yc, r));
                }
            }
        }
    }
}
