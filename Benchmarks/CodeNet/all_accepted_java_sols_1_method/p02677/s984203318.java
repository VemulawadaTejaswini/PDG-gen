import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double H = sc.nextDouble();
        double M = sc.nextDouble();
        sc.close();

        double Hx = A * Math.sin(Math.toRadians(360 * (H + M / 60) / 12));
        double Hy = A * Math.cos(Math.toRadians(360 * (H + M / 60) / 12));

        double Mx = B * Math.sin(Math.toRadians(360 * M / 60));
        double My = B * Math.cos(Math.toRadians(360 * M / 60));

        double x = (Hx - Mx);
        double y = (Hy - My);

        System.out.println(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }
}