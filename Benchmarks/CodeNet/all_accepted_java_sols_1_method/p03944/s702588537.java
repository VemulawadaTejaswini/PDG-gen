import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC047B - すぬけ君の塗り絵 2 イージー / Snuke's Coloring 2 (ABC Edit)

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();   // 1 <= w,h <= 100
        int h = sc.nextInt();
        int n = sc.nextInt();   // 1 <= n <= 100

        int x1 = 0;
        int x2 = w;
        int y1 = 0;
        int y2 = h;

        int x = 0;   // 0 <= x <= w
        int y = 0;   // 0 <= y <= h
        int a = 0;   // 1, 2, 3, 4

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();

            switch(a) {
            case 1:
                if (x1 < x) x1 = x;
                break;
            case 2:
                if (x2 > x) x2 = x;
                break;
            case 3:
                if (y1 < y) y1 = y;
                break;
            case 4:
                if (y2 > y) y2 = y;
                break;
            }
        }

        int xx = x2 - x1;
        int yy = y2 - y1;

        System.out.println((xx > 0 && yy > 0) ? xx * yy : 0);
    }
}