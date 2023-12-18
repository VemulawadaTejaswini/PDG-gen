import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = h*60+m;
        double hd = 0.5*time;
        double md = 6.0*m;

        double hx = Math.sin(Math.toRadians(hd)) * a;
        double hy = Math.cos(Math.toRadians(hd)) * a;
        double mx = Math.sin(Math.toRadians(md)) * b;
        double my = Math.cos(Math.toRadians(md)) * b;

        double x = (hx - mx);
        if (x<0) {
            x *= -1;
        }
        double y = (hy - my);
        if (y<0) {
            y *= -1;
        }
        double ans = x*x + y*y;
        System.out.println(Math.sqrt(ans));
    }
}
