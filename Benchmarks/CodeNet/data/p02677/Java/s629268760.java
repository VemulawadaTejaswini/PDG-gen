import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double hour = H * 360 / 12 + M * 30 / 60;
        double min =  M * 360 / 60;
        double ans = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(Math.abs(hour - min))));
        System.out.println(ans);
    }
}