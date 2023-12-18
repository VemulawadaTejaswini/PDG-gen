

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int h=scanner.nextInt();
        int m=scanner.nextInt();
        double c=angle(h%12,m);
        c=Math.toRadians(c);
        double ss=Math.sqrt( (double)Math.pow(a,2)+ (double)Math.pow(b,2)- ((double)2*(double)a*(double)b*(double)Math.cos(c)) );
        System.out.println(ss);
    }
    public static double angle(int hour, int minute) {
        if (hour < 0 || minute < 0) {
            return -1;
        }
        if (hour == 12) {
            hour = 0;
        }
        if (minute == 60) {
            minute = 0;
            hour += 1;
        }
        double hourAngle = (hour * 60 + minute) * 0.5;
        double minAngle = minute * 6;
        double bwAngle = Math.abs(hourAngle - minAngle);
        return Math.min(360 - bwAngle, bwAngle);

    }

}
