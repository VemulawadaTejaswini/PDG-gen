import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        double W = sc.nextInt();
        double H = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();
        int split = 0;

        if(W/2D == x && H/2D == y)split=1;

        System.out.println(W*H/2D + " " + split);
    }
}