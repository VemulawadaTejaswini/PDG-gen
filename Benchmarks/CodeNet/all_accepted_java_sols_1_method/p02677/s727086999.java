import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        final Scanner sc=new Scanner(System.in);

        final double A = Integer.parseInt(sc.next());
        final double B = Integer.parseInt(sc.next());
        final double H = Integer.parseInt(sc.next());
        final double M = Integer.parseInt(sc.next());

        double parseH = H * 30d + (30d * (M / 60d));
        double parseM = M * 6d;

        double ang = Math.abs(parseH - parseM);
        double ans = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) -2d * A * B * Math.cos(Math.toRadians(ang)));
        System.out.print(ans);
    }
}