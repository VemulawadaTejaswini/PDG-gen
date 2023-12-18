import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            double r = scanner.nextDouble();
            double a = r*r*Math.PI;
            double b = 2*r*Math.PI;
            System.out.printf("%.6f %.6f", a,b);
    }
}
