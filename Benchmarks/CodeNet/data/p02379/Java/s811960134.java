import java.util.Scanner;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        Point p1 = new Point();
        Point p2 = new Point();
 
        p1.setX(scanner.nextDouble());
        p1.setY(scanner.nextDouble());
        p2.setX(scanner.nextDouble());
        p2.setY(scanner.nextDouble());
 
        System.out.printf("%.10f\n", calcDistance(p1,p2));
    }
 
    public static double calcDistance(Point p1,Point p2){
        return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
    }
}
 
class Point{
 
    private double x;
    private double y;
 
    Point(){
        x = 0;
        y = 0;
    }
 
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
