import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int xa = sc.nextInt();
        int ya = sc.nextInt();
        int xb = sc.nextInt();
        int yb = sc.nextInt();

        int xc, yc, xd, yd;

        int ab_x = xb - xa;
        int ab_y = yb - ya;

        xc = xb - ab_y;
        yc = yb + ab_x;
        xd = xa - ab_y;
        yd = ya + ab_x;

        System.out.println(xc + " " + yc + " " + xd + " " + yd);
    }
}