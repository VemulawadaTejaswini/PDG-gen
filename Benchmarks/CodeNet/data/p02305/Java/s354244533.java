import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1x = sc.nextInt();
        int c1y = sc.nextInt();
        int c1r = sc.nextInt();
        int c2x = sc.nextInt();
        int c2y = sc.nextInt();
        int c2r = sc.nextInt();
        int dx = c1x - c2x;
        int dy = c1y - c2y;
        int sum = c1r + c2r;
        int diff = c1r - c2r;
        int sumR = sum * sum;
        int diffR = diff * diff;
        int distance = dx * dx + dy * dy;
        if (distance == diffR) {
            System.out.println(1);
        } else if (distance + c1r * c1r < c2r * c2r || distance + c2r * c2r < c1r * c1r) {
            System.out.println(0);
        } else if (distance == sumR) {
            System.out.println(3);
        } else if (distance < sumR) {
            System.out.println(2);
        } else {
            System.out.println(4);
        }
    }
}