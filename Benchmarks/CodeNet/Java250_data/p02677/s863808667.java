import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextInt();
        double m = sc.nextInt();
        double mm = -Math.toRadians(m)*6;
        double hh = -Math.toRadians(h+m/60)*30;
        double x = Math.cos(hh)*a-Math.cos(mm)*b;
        double y = Math.sin(hh)*a-Math.sin(mm)*b;
        System.out.println(Math.sqrt(x*x+y*y));
    }
}
