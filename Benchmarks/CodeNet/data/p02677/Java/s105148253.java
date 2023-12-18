
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), H = sc.nextInt(), M = sc.nextInt();
        double a_rad = (H * 30 + M * 0.5f) * Math.PI / 180;
        double b_rad = M * 6 * Math.PI / 180;
        double a_x = Math.sin(a_rad) * a;
        double a_y = Math.cos(a_rad) * a;
        double b_x = Math.sin(b_rad) * b;
        double b_y = Math.cos(b_rad) * b;
        System.out.println(a_x + ", " + a_y + ", " + b_x + ", " + b_y);
        double dist = Math.sqrt((a_x - b_x) * (a_x - b_x) + (a_y - b_y) * (a_y - b_y));
        System.out.println(dist);
    }
}
