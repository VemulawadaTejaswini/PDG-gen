import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        double ans = (double)w * (double)h / (double)2;
        if (x * 2 == w && y * 2 == h) {
            System.out.println(ans + " 1");
        } else if ((x * 2 == w && y * 2 != h) || (x * 2 != w && y * 2 == h)) {
            System.out.println(ans + " 0");
        } else {
            System.out.println(ans + " 0");
        }
    }
}
