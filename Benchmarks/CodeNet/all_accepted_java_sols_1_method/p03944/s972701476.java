import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int startX = 0;
        int startY = 0;
        int endX = w;
        int endY = h;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if (a == 1) {
                if (startX < x) {
                    startX = x;
                }
            } else if (a == 2) {
                if (endX > x) {
                    endX = x;
                }
            } else if (a == 3) {
                if (startY < y) {
                    startY = y;
                }
            } else if (a == 4) {
                if (endY > y) {
                    endY = y;
                }
            }
        }

        if (startX > endX || startY > endY) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(startX - endX) * Math.abs(startY - endY));

        }
    }
}