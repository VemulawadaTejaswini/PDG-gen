import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double ax = a * Math.sin(Math.PI * 2 * (1d / 12 * h + 1d/12/60 * m));
        double ay = a * Math.cos(Math.PI * 2 * (1d / 12 * h + 1d/12/60 * m));
        double bx = b * Math.sin(Math.PI * 2 / 60 * m);
        double by = b * Math.cos(Math.PI * 2 / 60 * m);

        System.out.printf("%.20f\n", Math.hypot(bx-ax, by-ay));
    }
}