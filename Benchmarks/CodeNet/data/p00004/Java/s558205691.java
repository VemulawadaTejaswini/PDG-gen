import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            double d = s.nextDouble();
            double e = s.nextDouble();
            double f = s.nextDouble();
             
            double x = (e*c - b*f)/(a*e - d*b);
            double y = (d*c - a*f)/(b*d - a*e);
            if(x == -0.0) {
                x = 0;
            }
            if(y == -0.0) {
                y = 0;
            }
            System.out.printf("%.3f %.3f\n",x,y);
        }
         
    }
}
