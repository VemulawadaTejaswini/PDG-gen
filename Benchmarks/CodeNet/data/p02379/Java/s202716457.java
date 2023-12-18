import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double x1, y1, x2, y2, ans;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        ans = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.printf("%.9f¥n", ans);
    }
}
