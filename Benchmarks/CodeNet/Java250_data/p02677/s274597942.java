import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int m = scan.nextInt();
        double angle = h * 30 - m * 5.5;
        angle = Math.abs(angle > 180 ? 360 - angle : angle);
        System.out.println(Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angle))));
        scan.close();
    }
}