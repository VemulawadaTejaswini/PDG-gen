import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double h = sc.nextInt();
        double m = sc.nextInt();
        double theta = (h * 60 + m) / 720 - m / 60;
        theta *= Math.PI * 2;
        System.out.println(Math.sqrt(- Math.cos(theta) * 2 * a * b + a * a + b * b));
    }
}