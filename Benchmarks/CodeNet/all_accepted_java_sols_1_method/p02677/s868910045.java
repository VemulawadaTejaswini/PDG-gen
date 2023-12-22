import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int H = s.nextInt();
        int M = s.nextInt();

        double Hx = A * Math.cos(Math.toRadians(90 - 30 * H - (double) M / 2));
        double Hy = A * Math.sin(Math.toRadians(90 - 30 * H - (double) M / 2));

        double Mx = B * Math.cos(Math.toRadians(90 - 6 * M));
        double My = B * Math.sin(Math.toRadians(90 - 6 * M));

        double d = Math.sqrt((Hx - Mx) * (Hx - Mx) + (Hy - My) * (Hy - My));
        System.out.print(d);
    }
}