import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = Math.PI;
        
        double s = r * r * pi;
        double l = 2 * r * pi;

        System.out.printf("%f %f", s, l);
        sc.close();
    }
}
