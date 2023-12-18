import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] wary = {0, w};
        int[] hary = {0, h};
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            switch (a) {
                case 1:
                    if (x > wary[0]) {
                        wary[0] = x;
                    }
                    break;
                case 2:
                    if (x < wary[1]) {
                        wary[1] = x;
                    }
                    break;
                case 3:
                    if (y > hary[0]) {
                        hary[0] = y;
                    }
                    break;
                case 4:
                    if (y < hary[1]) {
                        hary[1] = y;
                    }
                    break;
            }
        }
        int x = wary[1] < wary[0] ? 0 : wary[1] - wary[0];
        int y = hary[1] < hary[0] ? 0 : hary[1] - hary[0];
        System.out.println(x * y);
    }
}