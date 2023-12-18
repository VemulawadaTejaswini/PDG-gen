import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.printf("%f\n", Math.sqrt(Math.cbrt(x2 - x1 + Math.cbrt(y2 - y1))));
        sc.close();
    }
}

