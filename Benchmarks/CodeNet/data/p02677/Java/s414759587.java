import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double alpha = h * Math.PI / 6;
        double beta = m * Math.PI / 30;

        point A = conv(a, alpha);
        point B = conv(b, beta);

        System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.PI-alpha-beta)));
        sc.close();

        
    }
    static class point{
        double x;
        double y;
        point(Double x, Double y){
            this.x = x;
            this.y = y;
        }
    }
    static double dis(point a, point b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
    static point conv(int r, double sita){
        return new point(r * Math.cos(sita), r * Math.sin(sita));
    }
}