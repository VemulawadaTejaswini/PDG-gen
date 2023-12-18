import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            
            double px = ((y1-y3)*(y1*y1 -y2*y2 +x1*x1 -x2*x2) -(y1-y2)*(y1*y1 -y3*y3 +x1*x1 -x3*x3)) / (2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
            double py = ((x1-x3)*(x1*x1 -x2*x2 +y1*y1 -y2*y2) -(x1-x2)*(x1*1 -x3*x3 +y1*y1 -y3*y3)) / (2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));

            double a = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
            double b = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
            double c = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
            double r = (a * b * c) / (Math.sqrt((a+b+c) * (-a+b+c) * (a-b+c) * (a+b-c)));          
            
            System.out.printf("%f.3 %f.3 %f.3\n", px, py, r);
        }
    }
}