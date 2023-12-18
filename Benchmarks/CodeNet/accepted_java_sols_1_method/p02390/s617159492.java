import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int S = sn.nextInt();
        int h = (int) Math.floor(S / 3600);
        int m = (int) Math.floor(S % 3600 / 60);
        int s = (int) Math.floor(S % 60);
        System.out.println(String.format("%d:%d:%d", h, m, s));
    }
}