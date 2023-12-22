import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double hAngle = 30 * H;
        double mAngle = 6 * M;

        hAngle += 30 * (mAngle / 360);
        
        double angle = Math.abs(hAngle - mAngle);
        double rad = Math.toRadians(angle);
        double cos = Math.cos(rad);
        double x = Math.pow(A,2) + Math.pow(B,2) - 2*A*B *cos;

        System.out.println(Math.sqrt(x));
    }
}