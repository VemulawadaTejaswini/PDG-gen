import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double dx = x2 - x1;
        double dy = y2 - y1;
        double d = Math.sqrt(dx * dx + dy * dy);
        System.out.println(d);
    }
}