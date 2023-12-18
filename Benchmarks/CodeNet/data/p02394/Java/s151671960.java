import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int W = sn.nextInt();
        int H = sn.nextInt();
        int x = sn.nextInt();
        int y = sn.nextInt();
        int r = sn.nextInt();
        
        System.out.println((0 <= x - r && x + r <= W && 0 <= y - r && y + r <= H) ? "Yes" : "No");
    }
}