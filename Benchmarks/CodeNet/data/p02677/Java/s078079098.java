import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double radian_H = Math.toRadians(30.0*h+(6.0*((m)/15.0)));
        double radian_M = Math.toRadians(6.0*m);
        double hx = a*Math.cos(Math.toRadians(30.0*h+(6.0*(m/12.0))));
        double hy = a*Math.sin(Math.toRadians(30.0*h+(6.0*(m/12.0))));
        double mx = b*Math.cos(Math.toRadians(6.0*m));
        double my = b*Math.sin(Math.toRadians(6.0*m));
        double hsa = Math.abs(hx-mx);
        double msa = Math.abs(hy-my);

        double ans = Math.sqrt(hsa*hsa + (msa*msa));
        System.out.println(ans);
    }
}