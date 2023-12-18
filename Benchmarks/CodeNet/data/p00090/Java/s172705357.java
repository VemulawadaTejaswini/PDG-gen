import java.awt.geom.Point2D;
import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            Point2D.Double[] p = new Point2D.Double[n];
            for(int i=0;i<n;i++){
                String[] s = sc.next().split(",");
                double a = Double.valueOf(s[0]);
                double b = Double.valueOf(s[1]);
                p[i] = new Point2D.Double(a,b);
            }
            int max = 1;
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(p[i].distance(p[j]) <= 2.00001){
                        double xa = p[i].x, ya = p[i].y, xb = p[j].x, yb = p[j].y;
                        double[] x = new double[2];
                        double[] y = new double[2];
                        double A = xa - xb;
                        double B = ya - yb;
                        double C = (A*xa + A*xb + B*ya + B*yb)/2;
                        if(A==0){
                           double c = (C/B - ya)*(C/B - ya)+xa*xa - 1;
                            x[0] = xa + sqrt(xa*xa - c);
                            x[1] = xa - sqrt(xa*xa - c);
                            y[0] = C/B;
                            y[1] = C/B;
                        }else if(B==0){
                            double c = (C/A-xa)*(C/A-xa)+ya*ya-1;
                            y[0] = ya + sqrt(ya*ya - c);
                            y[1] = ya - sqrt(ya*ya - c);
                            x[0] = C/A;
                            x[1] = C/A;
                        }else{
                            double a = 1 + (A*A) / (B*B);
                            double b = (2*A*ya*B - 2*A*C - 2*xa*B*B)/(B*B);
                            double c = (C/B - ya)*(C/B - ya) + xa*xa - 1;
                            x[0] = (-b + sqrt(b*b - 4*a*c))/(2*a);
                            x[1] = (-b - sqrt(b*b - 4*a*c))/(2*a);
                            y[0] = (C - A*x[0])/B;
                            y[1] = (C - A*x[1])/B;
                        }
                         
                        for(int k = 0; k < 2; k++){
                            int cnt = 0;
                            for(int l = 0; l < n; l++){
                                if(p[l].distance(x[k],y[k]) <= 1.00001) cnt++;
                            }
                            max = max(max, cnt);
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }   
}