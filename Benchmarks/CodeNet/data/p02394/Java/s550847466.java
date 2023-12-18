import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int a, b, c, d;
        a = x + r;
        b = x - r;
        c = y + r;
        d = y - r;
        if(a < W && b > 0 && c < H && d > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
