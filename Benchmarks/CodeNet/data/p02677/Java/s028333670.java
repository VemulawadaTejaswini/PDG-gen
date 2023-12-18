import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double ak = Math.toRadians(h * 30 + (double)( m / 2));
        double bk = Math.toRadians(m * 6);
        double ax = a * Math.sin(ak);
        double ay = a * Math.cos(ak);
        double bx = b * Math.sin(bk);
        double by = b * Math.cos(bk);



        System.out.println(Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by)));
    }

}