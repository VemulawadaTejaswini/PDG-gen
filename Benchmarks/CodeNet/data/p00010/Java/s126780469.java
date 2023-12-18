import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double px = ((y1-y3)*(Math.pow(y1,2) -Math.pow(y2,2) +Math.pow(x1,2) -Math.pow(x2,2)) -(y1-y2)*(Math.pow(y1,2) -Math.pow(y3,2) +Math.pow(x1,2) -Math.pow(x3,2))) / (2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
            double py = ((x1-x3)*(Math.pow(x1,2) -Math.pow(x2,2) +Math.pow(y1,2) -Math.pow(y2,2)) -(x1-x2)*(Math.pow(x1,2) -Math.pow(x3,2) +Math.pow(y1,2) -Math.pow(y3,2))) / (2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));
            double r = Math.pow(Math.pow(x1-px,2) + Math.pow(y1-py,2), 0.5);
            System.out.format("%.3f %.3f %.3f\n", px, py, r);
        }
    }
}