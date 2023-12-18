import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        double x1 = scan.nextInt();
        double y1 = scan.nextInt();
        double x2 = scan.nextInt();
        double y2 = scan.nextInt();
        double dx = x2 - x1;
        double dy = y2 - y1;
        double d = Math.sqrt(dx * dx + dy * dy);
        System.out.println(d);
    }
}