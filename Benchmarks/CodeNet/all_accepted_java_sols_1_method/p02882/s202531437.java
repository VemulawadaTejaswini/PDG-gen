import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            double x = in.nextDouble() / a;
            double half = a * b / 2.0;
            if (half < x){
                double b2 = 2 * (b - x/a);
                double ang = Math.toDegrees(Math.atan2(b2,a));
                System.out.println(ang);
            } else {
                double a2 = (x*2) / b;
                double ang = Math.toDegrees(Math.atan2(a2,b));
                System.out.println(90 - ang);
            }
        }
    }
}
