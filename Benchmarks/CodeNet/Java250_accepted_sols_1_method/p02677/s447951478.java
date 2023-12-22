import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        double hx = a * Math.cos(Math.toRadians(90.0 - (30.0 * h + 0.5 * m)));
        double hy = a * Math.sin(Math.toRadians(90.0 - (30.0 * h + 0.5 * m)));
        double mx = b * Math.cos(Math.toRadians(90.0 - (6.0 * m)));
        double my = b * Math.sin(Math.toRadians(90.0 - (6.0 * m)));
        double rad = Math.sqrt((mx - hx) * (mx - hx) + (my - hy) * (my - hy));
        System.out.println(rad);
    }
}
