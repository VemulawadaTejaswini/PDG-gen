import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double angH = 30 * H;
        double angM =  5.5 * M;
        double red = Math.toRadians(Math.abs(angH-angM));
        double res = 0;
        res = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(red));
        System.out.println(res);
    }
}