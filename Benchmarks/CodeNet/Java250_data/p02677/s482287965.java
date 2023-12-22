import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double hour = H * 360 / 12.0 + M * 360 / 60.0 / 12.0;
        double min =  M * 360 / 60.0;
        double diff = Math.abs(hour - min);
//        System.out.println(diff);
        double degree = Math.min(diff, 360 - diff);
//        System.out.println(degree);
        double ans = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(degree)));
        System.out.println(ans);
    }
}